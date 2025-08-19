package com.ex.framework.ioc;

import com.ex.domain.testPost.service.TestPostService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {
    private String basePackage;
    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>();
    private final Map<String, Object> beanDefinitionMap = new ConcurrentHashMap<>();

    public ApplicationContext(String basePackage) {
        this.basePackage = basePackage;
    }

    public void init() {

    }

    public <T> T genBean(String beanName) {
        if (singletonObjects.containsKey(beanName)) {
            return (T) singletonObjects.get(beanName);
        }

        Object bean = switch (beanName) {
            case "testPostService" -> new TestPostService();
            default -> null;
        };
        singletonObjects.put(beanName, bean);

        return (T) bean;
    }
}
