package com.xiaorui.singleton.lazysingleton;

public class StaticInnerSingleton {

    private StaticInnerSingleton() {

    }

    public StaticInnerSingleton getInstance() {
        return InnerInstance.INSTANCE_HOLDER;
    }


    private static class InnerInstance{

        private static final StaticInnerSingleton INSTANCE_HOLDER = new StaticInnerSingleton();

    }

}
