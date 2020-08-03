package com.java.command;

/**
 * @ClassName: LightOffCommand
 * @Author: kunyao
 * @Description: 命令模式 - 具体命令
 * @Date: 2020/7/26 14:04
 * @Version: 1.0
 */
public class LightOffCommand implements Command {


    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接受者的方法a
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
