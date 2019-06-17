package com.xiaorui.factory.factorymethod;

import com.xiaorui.factory.IProduct;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IProductFactory earphoneFactoyr = new EarphoneFactory();
        IProduct earphone = earphoneFactoyr.create();
        earphone.desc();

        IProductFactory phoneFactory = new PhoneFactory();
        IProduct phone = phoneFactory.create();
        phone.desc();
    }
}
