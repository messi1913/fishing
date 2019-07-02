package com.ddastudio.fishing.common.util;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.util.Objects;

public class BeanUtil {

    /**
     * 빈을 직접 얻습니다.
     *
     * @param t : 빈클래스 객체
     * @return Objejct
     */
    public static <T> Class<T> getBean(T t) {
        WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
        return (Class<T>) Objects.requireNonNull(context).getBean(t.getClass().getSimpleName());
    }
}
