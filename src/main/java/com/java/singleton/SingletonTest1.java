package com.java.singleton;

/**
 * @ClassName: SingletonTest1
 * @Author: kunyao
 * @Description: 单例设计模式-饿汉式
 * @Date: 2020/7/18 21:32
 * @Version: 1.0
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1); //true
    }
}


class Singleton{

    //私有化构造函数
    private Singleton(){

    }

    //本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //提供一个方法返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
