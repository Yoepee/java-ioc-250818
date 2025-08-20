package com.ex.framework.ioc.util;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;

public class ClsUtil {
    @SneakyThrows
    public static <T> Class<T> loadClass(String clsPath) {
        return (Class<T>) Class.forName(clsPath);
    }

    @SneakyThrows
    public static <T> T construct(String s, Object[] objects) {
        Constructor<T> constructor = getConstructor(loadClass(s));

        return (T) constructor.newInstance(objects);
    }

    private static <T> Constructor<T> getConstructor(Class<T> cls) {
        return (Constructor<T>) cls.getDeclaredConstructors()[0];
    }
}
