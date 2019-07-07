package com.ddastudio.fishing.common.util;

import com.ddastudio.fishing.common.domain.ErrorResource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;

public class CommonUtil {

    public static ResponseEntity badRequest(Errors errors) {
        return ResponseEntity.badRequest().body(new ErrorResource(errors));
    }
}
