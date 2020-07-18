package com.java.singleton;

/**
 * @ClassName: SingletonTest1
 * @Author: kunyao
 * @Description: 单例设计模式-懒汉式 - 线程安全
 * @Date: 2020/7/18 21:32
 * @Version: 1.0
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance1 = Singleton4.getInstance();

        System.out.println(instance == instance1); //true
    }
}


class Singleton4{
    //本类内部创建对象实例
    private static Singleton4 instance;

    //私有化构造函数
    private Singleton4(){

    }

    //提供一个方法返回实例对象,当使用该方法时，才创建instance,使用synchronized同步代码块保证线程安全
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
