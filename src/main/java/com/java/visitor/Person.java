package com.java.visitor;

/**
 * @ClassName: Person
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/26 19:10
 * @Version: 1.0
 */
public abstract class Person {

    public abstract void accept(Action action);
}
