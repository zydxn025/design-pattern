package com.xiaorui.factory.abstractfactory;

public class SonyProductFactory  implements AbstractFactory{

    @Override
    public IEarphone createEarphone() {
        return new SonyEarphone();
    }

    @Override
    public IPhone createPhone() {
        return new SonyPhone();
    }
}
