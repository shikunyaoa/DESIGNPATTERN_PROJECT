package com.java.visitor;

/**
 * @ClassName: Woman
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/26 19:10
 * @Version: 1.0
 */
public class Woman extends Person {


    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
