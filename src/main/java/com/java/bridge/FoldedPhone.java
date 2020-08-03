package com.java.bridge;

/**
 * @ClassName: FoldedPhone
 * @Author: kunyao
 * @Description: 另一种特性
 * @Date: 2020/7/22 22:11
 * @Version: 1.0
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }


    @Override
    protected void open() {
        super.open();
    }

    @Override
    protected void close() {
        super.close();
    }

    @Override
    protected void call() {
        super.call();
    }
}
