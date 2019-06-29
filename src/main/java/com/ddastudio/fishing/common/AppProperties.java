package com.ddastudio.fishing.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

@Component
@ConfigurationProperties(prefix = "fishing")
@Getter
@Setter
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

}
