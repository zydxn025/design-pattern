package com.xiaorui.factory.abstractfactory;

public class MiProductFactory implements AbstractFactory {
    @Override
    public IEarphone createEarphone() {
        return new MiEarphone();
    }

    @Override
    public IPhone createPhone() {
        return new MiPhone();
    }
}
