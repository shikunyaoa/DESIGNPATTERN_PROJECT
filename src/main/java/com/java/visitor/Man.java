package com.java.visitor;

/**
 * @ClassName: Man
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/26 19:10
 * @Version: 1.0
 */
public class Man extends Person {


    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
