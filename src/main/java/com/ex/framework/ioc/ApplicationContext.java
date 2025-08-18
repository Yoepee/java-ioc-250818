package com.ex.framework.ioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {
    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>();
    private final Map<String, Object> beanDefinitionMap = new ConcurrentHashMap<>();

    public ApplicationContext(String basePackage) {

    }

    public void init() {

    }

    public <T> T genBean(String beanName) {
        if (singletonObjects.containsKey(beanName)) {
            return (T) singletonObjects.get(beanName);
        }

        return null;
    }
}
