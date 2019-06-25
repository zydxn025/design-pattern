package com.xiaorui.singleton.destorysingleton;

import com.xiaorui.singleton.hungrysingleton.HungrySingleton;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例
 */
public class ReflectionDestory {

    public static void main(String[] args) {
        desotorySingleton();
    }

    /**
     * 反射破坏单例 可以在单例方法构造器添加判断当已有一个实例化的对象时抛出异常,不允许使用反射构造器实例化
     */
    static void desotorySingleton() {

        Class<HungrySingleton> clazz = HungrySingleton.class;
        try {
            Constructor<HungrySingleton> cons = clazz.getDeclaredConstructor(null);
            cons.setAccessible(true);
            HungrySingleton refInstance = cons.newInstance();
            HungrySingleton instance = HungrySingleton.getInstance();


            System.out.println("反射实例化==>"+refInstance);
            System.out.println("单例方法实例化==>"+instance);
            System.out.println("是否是一个实例==>"+(refInstance == instance));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
