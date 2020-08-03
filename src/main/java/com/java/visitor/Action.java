package com.java.visitor;

/**
 * @ClassName: Action
 * @Author: kunyao
 * @Description: 访问者模式 - 数据操作类
 * @Date: 2020/7/26 19:08
 * @Version: 1.0
 */
public abstract class Action {

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
