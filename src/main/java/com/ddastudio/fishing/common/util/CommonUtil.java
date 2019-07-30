package com.ddastudio.fishing.common.util;

import com.ddastudio.fishing.common.AppProperties;
import com.ddastudio.fishing.common.domain.EnvDAO;
import com.ddastudio.fishing.common.domain.ErrorResource;
import org.apache.commons.codec.binary.Base64;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.Errors;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.util.Map;

@SuppressWarnings("unchecked")
public class CommonUtil {

    public static ResponseEntity badRequest(Errors errors) {
        return ResponseEntity.badRequest().body(new ErrorResource(errors));
    }

    public static <T> ResponseEntity<T> exchange(String url, HttpMethod method , Map<String, String> headerMap, String body, Class<T> responseType) {
        RestTemplate restTemplate = BeanUtil.getBean(RestTemplate.class);
        URI uri = URI.create(url);
        HttpHeaders headers = new HttpHeaders();
        headerMap.forEach(headers::set);

        HttpEntity httpEntity = new HttpEntity(body, headers);
        return  restTemplate.exchange(uri, method, httpEntity, responseType);
    }

    public static Map<String, Object> requestOauth(String userName, String userPassword) {
        RestTemplate restTemplate = BeanUtil.getBean(RestTemplate.class);
        AppProperties appProperties = BeanUtil.getBean(AppProperties.class);

        String clientCredentials = appProperties.getClientId()+":"+appProperties.getClientSecret();
        String encodedClientCredentials = new String(Base64.encodeBase64(clientCredentials.getBytes()));

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic "+encodedClientCredentials);
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("grant_type", "password");
        parameters.add("username", userName);
        parameters.add("password", userPassword);

        ResponseEntity<Map> responseEntity = restTemplate.exchange("https://127.0.0.1:8081/oauth/token", HttpMethod.POST, new HttpEntity<>(parameters, headers), Map.class);
        return responseEntity.getBody();
    }

    public static String getProperty(String key, String defaultValue) {
        return BeanUtil.getBean(EnvDAO.class).getProperty(key).orElse(defaultValue);
    }
}
