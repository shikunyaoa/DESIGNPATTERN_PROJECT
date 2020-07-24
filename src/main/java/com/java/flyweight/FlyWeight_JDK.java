package com.java.flyweight;

/**
 * @ClassName: FlyWeight_JDK
 * @Author: kunyao
 * @Description: 享元模式在JDK中的使用
 * @Date: 2020/7/24 21:47
 * @Version: 1.0
 */
public class FlyWeight_JDK {

    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        System.out.println(x.equals(y));
    }
}
