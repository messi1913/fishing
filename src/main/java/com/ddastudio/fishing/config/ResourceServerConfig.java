package com.ddastudio.fishing.config;

import com.ddastudio.fishing.common.AppProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
@RequiredArgsConstructor
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    private final AppProperties appProperties;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(appProperties.getResourceId());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .anonymous()
                .and()
            .authorizeRequests()
                .mvcMatchers(HttpMethod.GET, "/api/**")
                    .permitAll()
                .mvcMatchers("/api/accounts*")
                    .permitAll()
                .anyRequest()
                    .authenticated()
                .and()
            .exceptionHandling()
                .accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }

}
