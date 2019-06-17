package com.xiaorui.factory.simplefactory;

import com.xiaorui.factory.Earphone;
import com.xiaorui.factory.IProduct;
import com.xiaorui.factory.Phone;

public class SImpleFactoryTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        IProduct earphone = ProductSimpleFactory.createByClassName("com.xiaorui.factory.Earphone");
        earphone.desc();
        IProduct earphone2 = ProductSimpleFactory.createByClazz(Earphone.class);
        earphone2.desc();
        IProduct phone = ProductSimpleFactory.createByClazz(Phone.class);
        phone.desc();

    }
}
