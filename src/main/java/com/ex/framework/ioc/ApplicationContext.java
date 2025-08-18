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

        if (beanName.equals("testPostService")) {
            TestPostService testPostService = new TestPostService();
            singletonObjects.put(beanName, testPostService);
            return (T) testPostService;
        }

        return null;
    }
}
