package com.xiaorui.factory.simplefactory;

import com.xiaorui.factory.IProduct;

public class ProductSimpleFactory {

    public static IProduct createByClazz(Class<?> clazz) throws IllegalAccessException, InstantiationException {
        return (IProduct) clazz.newInstance();
    }


    public static IProduct createByClassName(String className) {
        IProduct product = null;
        if (className != null && !"".equals(className)) {
            try {
                product = (IProduct) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return product;
    }

}
