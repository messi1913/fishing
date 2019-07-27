package com.ddastudio.fishing.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

@Component
@ConfigurationProperties(prefix = "fishing")
@Data
public class AppProperties {
    @NotEmpty
    private String adminUsername;

    @NotEmpty
    private String adminPassword;

    @NotEmpty
    private String userUsername;

    @NotEmpty
    private String userPassword;

    @NotEmpty
    private String clientId;

    @NotEmpty
    private String clientSecret;

    @NotEmpty
    private String resourceId;

    @NotEmpty
    private String oauthPassword;

    @NotEmpty
    private String oauthAlias;

    @NotEmpty
    private String oauthPublicKey;

    private String smsApiKey;
    private String smsApiSecret;
    private String senderPhoneNo;

    private String bankClientId;
    private String bankClientSecret;
    private String bankAccessToken;

}

