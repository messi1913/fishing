package com.ddastudio.fishing.common.util;

import com.ddastudio.fishing.common.AppProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
@Slf4j
public class SMSService {

    private final AppProperties properties;

    public String sendSMS(String phoenNo) {
        Message smsService = new Message(properties.getSmsApiKey(), properties.getSmsApiSecret());
        String key = SMSKey.getKey(6);

        HashMap<String, String> map = new HashMap<>();
        map.put("to", phoenNo);
        map.put("from", "01099891913");
        map.put("text", "[DDA Studio] 낚시왕 인증번호 [" + key + "] 를 입력해 주세요.");
        map.put("type", "sms");

        try {
            JSONObject returnJSON = smsService.sendPostRequest("send", map);
            log.info("SUCCESS TO SMS Service");
            log.info(returnJSON.toString());
            log.info(returnJSON.toJSONString());
            return key;
        } catch (CoolsmsException e) {
            log.error(e.getMessage());
            return "ERROR";

        }


    }

}
