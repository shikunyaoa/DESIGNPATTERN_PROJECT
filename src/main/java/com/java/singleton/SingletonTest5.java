package com.java.singleton;

/**
 * @ClassName: SingletonTest1
 * @Author: kunyao
 * @Description: 单例设计模式-双重检查
 * @Date: 2020/7/18 21:32
 * @Version: 1.0
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance1 = Singleton5.getInstance();

        System.out.println(instance == instance1); //true
    }
}


class Singleton5{
    //本类内部创建对象实例
    private static volatile Singleton5 instance;

    //私有化构造函数
    private Singleton5(){

    }

    //提供一个方法返回实例对象,当使用该方法时，才创建instance,使用synchronized同步代码块保证线程安全
    public static  Singleton5 getInstance(){
        if(instance == null){
            synchronized(Singleton5.class){
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
