package com.xiaorui.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory sonyFactory = new SonyProductFactory();
        AbstractFactory miFactory = new MiProductFactory();
        IEarphone sonyEarphone = sonyFactory.createEarphone();
        IPhone sonyPhone = sonyFactory.createPhone();

        IEarphone miEearphone = miFactory.createEarphone();

        IPhone miPhone = miFactory.createPhone();

        sonyEarphone.operation();
        sonyPhone.operation();

        miEearphone.operation();
        miPhone.operation();
        }
}
