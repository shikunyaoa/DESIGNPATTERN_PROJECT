package com.java.singleton;

/**
 * @ClassName: SingletonTest1
 * @Author: kunyao
 * @Description: 单例设计模式-枚举
 * @Date: 2020/7/18 21:32
 * @Version: 1.0
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton7 instance = Singleton7.INSTANCE;
        Singleton7 instance1 = Singleton7.INSTANCE;

        System.out.println(instance == instance1); //true
    }
}


enum  Singleton7{
    INSTANCE;
}
