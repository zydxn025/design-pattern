package com.xiaorui.singleton.lazysingleton;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance; //volatile防止cpu指令重排序

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }


}
