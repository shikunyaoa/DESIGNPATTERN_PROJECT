package com.java.bridge;

/**
 * @ClassName: Phone
 * @Author: kunyao
 * @Description: 桥接模式
 * @Date: 2020/7/22 22:09
 * @Version: 1.0
 */
public abstract class Phone {


    //组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected  void open(){
        this.brand.open();
    }

    protected  void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
