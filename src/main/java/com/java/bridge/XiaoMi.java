package com.java.bridge;

/**
 * @ClassName: XiaoMi
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/22 22:07
 * @Version: 1.0
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米");
    }

    @Override
    public void close() {
        System.out.println("小米");
    }

    @Override
    public void call() {
        System.out.println("小米");
    }
}
