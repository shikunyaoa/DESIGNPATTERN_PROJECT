package com.java.facade;

/**
 * @ClassName: Popcorn
 * @Author: kunyao
 * @Description: 外观模式 - 子系统类
 * @Date: 2020/7/24 17:04
 * @Version: 1.0
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" popcorn on");
    }

    public void off(){
        System.out.println(" popcorn off");
    }

    public void play(){
        System.out.println(" popcorn is playing");
    }

    public void pause(){
        System.out.println(" popcorn is pause");
    }

}
