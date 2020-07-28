package com.java.memento.theory;

/**
 * @ClassName: Originator
 * @Author: kunyao
 * @Description: 备忘录模式
 * @Date: 2020/7/27 22:06
 * @Version: 1.0
 */
public class Originator {

    private String state; //状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //用于保存状态对象
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
