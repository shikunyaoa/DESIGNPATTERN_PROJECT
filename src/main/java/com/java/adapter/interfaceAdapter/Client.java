package com.java.adapter.interfaceAdapter;

/**
 * @ClassName: Client
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/22 20:57
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        //只需要实现自己需要的接口
        AbstractAdapter abs = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("我需要的只有m1方法");
            }
        };

        abs.m1();
    }
}
