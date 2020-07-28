package com.java.memento.theory;

/**
 * @ClassName: Memento
 * @Author: kunyao
 * @Description: 备忘录模式
 * @Date: 2020/7/27 22:08
 * @Version: 1.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
