package com.xiaorui.singleton.registersingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private static Map<String, Object> sinletonMap = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        Object instance = sinletonMap.get(className);
        if (instance == null) {
            synchronized (sinletonMap) {
                if (sinletonMap.get(className) == null) {
                    Object obj = null;
                    try {
                        obj = Class.forName(className).newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sinletonMap.put(className, obj);
                    instance = obj;
                }
            }
        }
        return instance;
    }





}
