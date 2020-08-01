package com.java.strategy;

/**
 * @ClassName: Duck
 * @Author: kunyao
 * @Description: 策略模式 - 鸭子抽象类
 * @Date: 2020/8/1 16:21
 * @Version: 1.0
 */
public abstract class Duck {

    //将策略聚合到该类中
    FlyBehavior flyBehavior;

    public Duck() {

    }

    public abstract void display();  //显示鸭子的信息

    public void quack(){
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim(){
        System.out.println("鸭子会游泳");
    }

    public void fly(){
       if(flyBehavior != null){
           flyBehavior.fly();
       }

    }
}
