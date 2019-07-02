package com.ddastudio.fishing.accounts.domain;

import lombok.*;

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


    public void confirm() {
        this.setAccountStatus("NML");
    }

    public void validateRegister() {
        Objects.requireNonNull(this.appId, "App Id is empty!!");
        Objects.requireNonNull(this.phoneNo, "Phone no is empty!!");
    }
}
