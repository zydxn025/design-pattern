package com.xiaorui.factory.factorymethod;

import com.xiaorui.factory.Earphone;
import com.xiaorui.factory.IProduct;

public class EarphoneFactory implements IProductFactory{
    @Override
    public IProduct create() {
        return new Earphone();
    }




}
