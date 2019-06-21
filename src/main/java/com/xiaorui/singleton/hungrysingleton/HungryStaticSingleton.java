package com.xiaorui.singleton.hungrysingleton;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton instance ;
    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return instance;
    }

}
