package com.java.command;

/**
 * @ClassName: LightOnCommand
 * @Author: kunyao
 * @Description: 命令模式 - 具体命令
 * @Date: 2020/7/26 13:58
 * @Version: 1.0
 */
public class LightOnCommand implements Command {

    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接受者的方法a
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
