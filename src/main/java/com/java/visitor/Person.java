package com.java.visitor;

/**
 * @ClassName: Person
 * @Author: kunyao
 * @Description: 访问者模式 - 数据结构类
 * @Date: 2020/7/26 19:10
 * @Version: 1.0
 */
public abstract class Person {

    public abstract void accept(Action action);
}
