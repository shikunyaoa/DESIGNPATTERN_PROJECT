package com.java.command;


//创建命令接口
public interface Command {

    public void execute();
    public void undo();
}
