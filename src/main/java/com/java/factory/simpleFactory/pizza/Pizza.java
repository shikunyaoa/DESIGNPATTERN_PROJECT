package com.java.factory.simpleFactory.pizza;

/**
 * @ClassName: Pizza
 * @Author: kunyao
 * @Description: 简单工厂案例
 * @Date: 2020/7/19 19:28
 * @Version: 1.0
 */
public abstract class Pizza {

    protected  String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking;");
    }

    public void cut(){
        System.out.println(name + " cutting;");
    }

    public void box(){
        System.out.println(name + " boxing");
    }

    public void setName(String name){
        this.name = name;
    }
}
