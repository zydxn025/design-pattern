package com.xiaorui.factory.factorymethod;

import com.xiaorui.factory.IProduct;
import com.xiaorui.factory.Phone;

public class PhoneFactory implements IProductFactory {
    @Override
    public IProduct create() {
        return new Phone();
    }
}
