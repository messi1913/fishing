package com.ddastudio.fishing.common.util;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class BeanUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;
    private final ApplicationContext context;

    @PostConstruct
    private void initApplicationContext() {
        applicationContext = this.context;
    }

    /**
     * 빈을 직접 얻습니다.
     *
     * @param clazz : 빈클래스 객체
     * @return T
     */
    public static <T> T getBean(final Class<T> clazz) {
        return applicationContext.getBean(clazz);

    }

    public static ApplicationContext getApplicationContext() {
        return BeanUtil.applicationContext;
    }
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanUtil.applicationContext = applicationContext;
    }
}
