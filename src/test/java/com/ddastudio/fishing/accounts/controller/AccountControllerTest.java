package com.ddastudio.fishing.accounts.controller;

import com.ddastudio.fishing.accounts.domain.AccountDAO;
import com.ddastudio.fishing.accounts.domain.AccountDTO;
import com.ddastudio.fishing.common.BaseControllerTest;
import com.ddastudio.fishing.common.MethodDescription;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Optional;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.restdocs.headers.HeaderDocumentation.*;
import static org.springframework.restdocs.headers.HeaderDocumentation.headerWithName;
import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.linkWithRel;
import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.links;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class AccountControllerTest extends BaseControllerTest {

    @Autowired
    AccountDAO accountDAO;

    @Test
    @MethodDescription("사용자를 생성한다.")
    public void registerAccount() throws Exception {
        AccountDTO accountDTO = AccountDTO.builder()
                .appId(1)
                .phoneNo("01099891913")
                .build();

        mockMvc.perform(post("/api/accounts")
                .accept(MediaTypes.HAL_JSON)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(objectMapper.writeValueAsString(accountDTO))
        ).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("appId").exists())
                .andExpect(jsonPath("phoneNo").exists())
                .andExpect(jsonPath("id").exists())
                .andExpect(jsonPath("smsVerifyNo").exists())
                .andExpect(jsonPath("accountStatus").exists())
                .andExpect(jsonPath("_links.self").exists())
                .andExpect(jsonPath("_links.profile").exists())
                .andExpect(jsonPath("_links.confirm-account").exists())
                .andDo(document("create-account",
                        links(
                                linkWithRel("self").description("link to self"),
                                linkWithRel("profile").description("link to profile"),
                                linkWithRel("confirm-account").description("link to confirm a registration")
                        ),
                        requestHeaders(
                                headerWithName(HttpHeaders.ACCEPT).description("accept header"),
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("content type")
                        ),
                        relaxedRequestFields(
                                fieldWithPath("phoneNo").type(String.class).description("Mobile number of user"),
                                fieldWithPath("appId").type(String.class).description("Identification of application")
                        ),
                        responseHeaders(
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("Content Type")
                        ),
                        relaxedResponseFields(
                                fieldWithPath("id").type(Integer.class).description("Identification of User"),
                                fieldWithPath("appId").type(Integer.class).description("Identification of application"),
                                fieldWithPath("phoneNo").type(String.class).description("Mobile number of user"),
                                fieldWithPath("accountStatus").type(String.class).description("Status of user"),
                                fieldWithPath("smsVerifyNo").type(String.class).description("Verification Code for registration"),
                                fieldWithPath("_links.self.href").description("Link to self"),
                                fieldWithPath("_links.confirm-account.href").description("Link to confirm registration"),
                                fieldWithPath("_links.profile.href").description("Link to profile")
                        )

                ));

    }

    @Test
    @MethodDescription("사용자 가입을 최종 확인한다.")
    public void confirmAccount() throws Exception {


        AccountDTO accountDTO = AccountDTO.builder()
                .appId(1)
                .phoneNo("01099891913")
                .build();
        Optional<AccountDTO> accountByPhoneNo = accountDAO.getAccountByPhoneNo(accountDTO);
        assertThat(accountByPhoneNo.isPresent()).isTrue();
        accountDTO = accountByPhoneNo.get();

        mockMvc.perform(patch("/api/accounts")
                .accept(MediaTypes.HAL_JSON)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(objectMapper.writeValueAsString(accountDTO))
        ).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("appId").exists())
                .andExpect(jsonPath("phoneNo").exists())
                .andExpect(jsonPath("id").exists())
                .andExpect(jsonPath("smsVerifyNo").exists())
                .andExpect(jsonPath("accountStatus").exists())
                .andExpect(jsonPath("_links.self").exists())
                .andExpect(jsonPath("_links.profile").exists())
                .andExpect(jsonPath("_links.update-account").exists())
                .andDo(document("confirm-account",
                        links(
                                linkWithRel("self").description("link to self"),
                                linkWithRel("profile").description("link to profile"),
                                linkWithRel("update-account").description("link to update user")
                        ),
                        requestHeaders(
                                headerWithName(HttpHeaders.ACCEPT).description("accept header"),
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("content type")
                        ),
                        relaxedRequestFields(
                                fieldWithPath("id").type(Integer.class).description("Identification of User"),
                                fieldWithPath("appId").type(Integer.class).description("Identification of application"),
                                fieldWithPath("smsVerifyNo").type(String.class).description("Verification Code for registration")
                        ),
                        responseHeaders(
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("Content Type")
                        ),
                        relaxedResponseFields(
                                fieldWithPath("id").type(Integer.class).description("Identification of User"),
                                fieldWithPath("appId").type(Integer.class).description("Identification of application"),
                                fieldWithPath("phoneNo").type(String.class).description("Mobile number of user"),
                                fieldWithPath("accountStatus").type(String.class).description("Status of user"),
                                fieldWithPath("smsVerifyNo").type(String.class).description("Verification Code for registration"),
                                fieldWithPath("_links.self.href").description("Link to self"),
                                fieldWithPath("_links.update-account.href").description("Link to update user"),
                                fieldWithPath("_links.profile.href").description("Link to profile")
                        )

                ));

    }

    @Test
    @MethodDescription("사용자 정보를 수정한다.")
    public void updateAccount() throws Exception {

        //When
        AccountDTO accountDTO = AccountDTO.builder()
                .appId(1)
                .phoneNo("01099891913")
                .build();
        Optional<AccountDTO> accountByPhoneNo = accountDAO.getAccountByPhoneNo(accountDTO);
        assertThat(accountByPhoneNo.isPresent()).isTrue();
        accountDTO = accountByPhoneNo.get();
        accountDTO.setAvatar("https://s3.ap-northeast-2.amazonaws.com/fishwang/avatar/1/boy-15.png");
        accountDTO.setCaptainYn("Y");
        accountDTO.setName("김상민");


        mockMvc.perform(put("/api/accounts")
                .accept(MediaTypes.HAL_JSON)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(objectMapper.writeValueAsString(accountDTO))
        ).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("appId").exists())
                .andExpect(jsonPath("phoneNo").exists())
                .andExpect(jsonPath("id").exists())
                .andExpect(jsonPath("smsVerifyNo").exists())
                .andExpect(jsonPath("accountStatus").exists())
                .andExpect(jsonPath("_links.self").exists())
                .andExpect(jsonPath("_links.profile").exists())
                .andExpect(jsonPath("_links.get-account").exists())
                .andDo(document("update-account",
                        links(
                                linkWithRel("self").description("link to self"),
                                linkWithRel("profile").description("link to profile"),
                                linkWithRel("get-account").description("link to retrieve user by id")
                        ),
                        requestHeaders(
                                headerWithName(HttpHeaders.ACCEPT).description("accept header"),
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("content type")
                        ),
                        relaxedRequestFields(
                                fieldWithPath("id").type(Integer.class).description("Identification of User"),
                                fieldWithPath("appId").type(Integer.class).description("Identification of application"),
                                fieldWithPath("avatar").type(String.class).description("URL of user's avatar"),
                                fieldWithPath("captainYn").type(String.class).description("Captain Y/N"),
                                fieldWithPath("name").type(String.class).description("Name of user")
                        ),
                        responseHeaders(
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("Content Type")
                        ),
                        relaxedResponseFields(
                                fieldWithPath("id").type(Integer.class).description("Identification of User"),
                                fieldWithPath("appId").type(Integer.class).description("Identification of application"),
                                fieldWithPath("phoneNo").type(String.class).description("Mobile number of user"),
                                fieldWithPath("accountStatus").type(String.class).description("Status of user"),
                                fieldWithPath("smsVerifyNo").type(String.class).description("Verification Code for registration"),
                                fieldWithPath("_links.self.href").description("Link to self"),
                                fieldWithPath("_links.get-account.href").description("Link to retrieve user"),
                                fieldWithPath("_links.profile.href").description("Link to profile")
                        )

                ));

    }

    @Test
    @MethodDescription("ID 를 통해서 사용자 를 조회한다.")
    public void getAccount() throws Exception {
        //When
        Optional<AccountDTO> accountByPhoneNo = accountDAO.getAccountByPhoneNo("01099891913");
        Integer id = accountByPhoneNo.get().getId();

        mockMvc.perform(get("/api/accounts/{id}", id)
                .accept(MediaTypes.HAL_JSON)
        ).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("appId").exists())
                .andExpect(jsonPath("phoneNo").exists())
                .andExpect(jsonPath("id").exists())
                .andExpect(jsonPath("smsVerifyNo").exists())
                .andExpect(jsonPath("accountStatus").exists())
                .andExpect(jsonPath("_links.self").exists())
                .andExpect(jsonPath("_links.profile").exists())
                .andExpect(jsonPath("_links.update-account").exists())
                .andDo(document("get-account",
                        links(
                                linkWithRel("self").description("link to self"),
                                linkWithRel("profile").description("link to profile"),
                                linkWithRel("update-account").description("link to update user")
                        ),
                        requestHeaders(
                                headerWithName(HttpHeaders.ACCEPT).description("accept header")
                        ),
                        responseHeaders(
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("Content Type")
                        ),
                        relaxedResponseFields(
                                fieldWithPath("id").type(Integer.class).description("Identification of User"),
                                fieldWithPath("appId").type(Integer.class).description("Identification of application"),
                                fieldWithPath("phoneNo").type(String.class).description("Mobile number of user"),
                                fieldWithPath("accountStatus").type(String.class).description("Status of user"),
                                fieldWithPath("smsVerifyNo").type(String.class).description("Verification Code for registration"),
                                fieldWithPath("name").type(String.class).description("Name of user"),
                                fieldWithPath("_links.self.href").description("Link to self"),
                                fieldWithPath("_links.update-account.href").description("Link to retrieve user"),
                                fieldWithPath("_links.profile.href").description("Link to profile")
                        )

                ));

    }

}