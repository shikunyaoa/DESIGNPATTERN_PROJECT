package com.java.singleton;

/**
 * @ClassName: SingletonTest1
 * @Author: kunyao
 * @Description: 单例设计模式-懒汉式 - 线程不安全
 * @Date: 2020/7/18 21:32
 * @Version: 1.0
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();

        System.out.println(instance == instance1); //true
    }
}


class Singleton3{
    //本类内部创建对象实例
    private static Singleton3 instance;

    //私有化构造函数
    private Singleton3(){

    }

    //提供一个方法返回实例对象,当使用该方法时，才创建instance
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
