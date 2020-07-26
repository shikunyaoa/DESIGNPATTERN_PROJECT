package com.java.visitor;

/**
 * @ClassName: Fail
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/26 19:12
 * @Version: 1.0
 */
public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男 失败了");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女 失败了");
    }
}
