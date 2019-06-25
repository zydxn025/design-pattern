package com.xiaorui.singleton.destorysingleton;

import com.xiaorui.singleton.lazysingleton.DoubleCheckSingleton;

import java.io.*;

/**
 * 序列化破坏单例
 */
public class SerializeDestorySingleton {

    public static void main(String[] args) {
        destory();
    }

    /**
     * 反序列化可以破坏单例,反序列化时会使用反射调用构造器方法实例化,并且会检查是否存在readResolve方法,有则返回该方法的的对象
     * 故在类中添加该方法返回实例化得对象即可解决序列化破坏单例 但实际上初始化了两次
     */
    static void destory() {
        DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton instance2 = null;
        try {
            //为简洁没有关闭流
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
            objectOutputStream.writeObject(instance1);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton.obj"));
            instance2 = (DoubleCheckSingleton) objectInputStream.readObject();
            System.out.println("单例方法实例化==>"+instance1);
            System.out.println("序列化实例化==>"+instance2);
            System.out.println("是否一个实例==>"+(instance1 == instance2));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
