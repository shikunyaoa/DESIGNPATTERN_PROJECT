package com.java.memento.game;

/**
 * @ClassName: Caretaker
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/28 19:40
 * @Version: 1.0
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
