package com.java.singleton;

/**
 * @ClassName: SingletonTest1
 * @Author: kunyao
 * @Description: 单例设计模式-饿汉式 - 静态代码块
 * @Date: 2020/7/18 21:32
 * @Version: 1.0
 */
public class SingletonTest2{
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();

        System.out.println(instance == instance1); //true
    }
}


class Singleton2{

    //私有化构造函数
    private Singleton2(){

    }
    //本类内部创建对象实例
    private static Singleton2 instance;

    //在静态代码块中创建单例对象
    static {
        instance = new Singleton2();
    }

    //提供一个方法返回实例对象
    public static Singleton2 getInstance(){
        return instance;
    }
}
