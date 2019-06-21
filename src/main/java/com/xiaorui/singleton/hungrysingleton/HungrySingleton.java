package com.xiaorui.singleton.hungrysingleton;

public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }


    public static HungrySingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance() == HungrySingleton.getInstance()   );
    }

}
