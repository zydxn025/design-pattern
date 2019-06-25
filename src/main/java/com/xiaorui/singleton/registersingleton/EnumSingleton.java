package com.xiaorui.singleton.registersingleton;

public enum EnumSingleton {
    SINGLETON;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
