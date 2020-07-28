package com.java.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Caretaker
 * @Author: kunyao
 * @Description: 备忘录模式
 * @Date: 2020/7/27 22:13
 * @Version: 1.0
 */
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    //获取第index个Originator的备忘录对象（即保存状态）
    public Memento get(int index){
        return mementoList.get(index);
    }
}
