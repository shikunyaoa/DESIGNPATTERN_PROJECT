package com.java.command;

/**
 * @ClassName: LightReceiver
 * @Author: kunyao
 * @Description: 命令模式 - 请求接受者
 * @Date: 2020/7/26 14:00
 * @Version: 1.0
 */
public class LightReceiver {

    public void on(){
        System.out.println("电灯打开了");
    }

    public void off(){
        System.out.println("电灯关闭了");
    }
}
