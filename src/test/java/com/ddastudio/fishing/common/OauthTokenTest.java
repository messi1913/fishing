//package com.ddastudio.fishing.common;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.oauth2.common.util.Jackson2JsonParser;
//import org.springframework.test.web.servlet.ResultActions;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//
//public class OauthTokenTest extends BaseControllerTest {
//
//    @Autowired
//    AppProperties appProperties;
//
//    @Test
//    public void propertiesTest(){
//        System.out.println(appProperties.getClientId());
//        System.out.println(appProperties.getClientSecret());
//        System.out.println(appProperties.getUserPassword());
//        System.out.println(appProperties.getUserUsername());
//
//    }
//
//    @Test
//    public void  getAccessToken() throws Exception {
//        ResultActions perform = this.mockMvc.perform(post("/oauth/token")
//                .with(httpBasic(appProperties.getClientId(), appProperties.getClientSecret()))
//                .param("username", appProperties.getUserUsername())
//                .param("password", appProperties.getUserPassword())
//                .param("grant_type", "password"))
//                .andDo(print());
//
//        var responseBody = perform.andReturn().getResponse().getContentAsString();
//        Jackson2JsonParser parser = new Jackson2JsonParser();
//        String access_token = parser.parseMap(responseBody).get("access_token").toString();
//        assertThat(access_token).isNotNull();
//    }
//}
