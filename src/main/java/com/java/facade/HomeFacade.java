package com.java.facade;

/**
 * @ClassName: HomeFacade
 * @Author: kunyao
 * @Description: 外观模式
 * @Date: 2020/7/24 16:58
 * @Version: 1.0
 */

/**
 * 外观
 */
public class HomeFacade {

    /**
     * 定义子系统对象
       可以有多个
     */
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    /**
     * 通过构造器初始化
     * @param dvdPlayer
     */
    public HomeFacade(DVDPlayer dvdPlayer) {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
    }

    //操作分四步
    public void ready(){
        popcorn.on();
        dvdPlayer.on();
    }

    public void pley(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        dvdPlayer.off();
    }

}
