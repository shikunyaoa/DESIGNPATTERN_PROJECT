package com.java.singleton;

/**
 * @ClassName: SingletonTest1
 * @Author: kunyao
 * @Description: 单例设计模式-静态内部类
 * @Date: 2020/7/18 21:32
 * @Version: 1.0
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();

        System.out.println(instance == instance1); //true
    }
}


class Singleton6{
    //本类内部创建对象实例
    private static volatile Singleton6 instance;

    //私有化构造函数
    private Singleton6(){

    }

    private static class Singleton6Instance{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static  Singleton6 getInstance(){
        return  Singleton6Instance.INSTANCE;
    }
}
