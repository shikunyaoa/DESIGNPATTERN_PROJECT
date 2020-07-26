package com.java.command;

/**
 * @ClassName: RemoteController
 * @Author: kunyao
 * @Description: 命令模式
 * @Date: 2020/7/26 17:17
 * @Version: 1.0
 */
public class RemoteController {

    //开 按钮的命令数组
    Command[] onCommands;
    //关 按钮的命令数组
    Command[] offCommands;

    //执行撤销的命令
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5 ; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }


    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonWasPushed(int no){
        //找到按下开的按钮，并调用对应方法
        onCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no){
        //找到按下关的按钮，并调用对应方法
        onCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = onCommands[no];
    }

    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
