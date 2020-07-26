package com.java.visitor;

/**
 * @ClassName: Success
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/26 19:11
 * @Version: 1.0
 */
public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男 成功了");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女 成功了");
    }
}
