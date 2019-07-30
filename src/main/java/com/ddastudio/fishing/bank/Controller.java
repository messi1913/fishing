package com.ddastudio.fishing.bank;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.ResponseEntity;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "api/banks", produces = MediaTypes.HAL_JSON_UTF8_VALUE)
public class Controller {

    @PostMapping
    public ResponseEntity getAuth(OAuth2Authentication auth ) {
        final OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) auth.getDetails();
        //token
        String accessToken = details.getTokenValue();

        Jwt decode = JwtHelper.decode(accessToken);
        String claims = decode.getClaims();
        System.out.println(claims);
        return ResponseEntity.ok(claims);
    }

}
