package com.ddastudio.fishing.accounts.domain;

import lombok.*;
import org.springframework.validation.Errors;

import java.time.LocalDate;
import java.util.Objects;

@Data
@EqualsAndHashCode(of = "id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    private Integer id;
    private String phoneNo;
    private Integer appId;
    private String name;
    private String avatar;
    private String role;
    private String captainYn;
    private String provider;
    private String providerUid;
    private LocalDate cancelDate;
    private String email;
    private String pw;
    private String refresh_token;
    private String emailCheck;
    private String accountStatus;
    private String smsVerifyNo;
    private String authToken;
    private String accessToken;
    private String refreshToken;

    public void confirm(String password) {
        this.setAccountStatus("NML");
        this.setPw(password);
    }

    public void validateRegister(Errors errors) {
        if (Objects.isNull(this.appId))
           errors.reject("Empty value", "App id is empty!!");


        if(Objects.isNull(this.phoneNo))
            errors.reject("Empty value", "Phone number is empty!!");
    }

    public void validateSmsCode(String code, Errors errors) {
        if(!this.smsVerifyNo.equalsIgnoreCase(code)) {
            errors.reject("Invalid value", "인증번호가 일치하지 않습니다. !!");
        }
    }
}
