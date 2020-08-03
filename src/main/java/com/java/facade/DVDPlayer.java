package com.java.facade;

/**
 * @ClassName: DVDPlayer
 * @Author: kunyao
 * @Description: 外观模式 - 子系统类
 * @Date: 2020/7/24 16:49
 * @Version: 1.0
 */
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" dvd on");
    }

    public void off(){
        System.out.println(" dvd off");
    }

    public void play(){
        System.out.println(" dvd is playing");
    }

    public void pause(){
        System.out.println(" dvd is pause");
    }
}
