package com.java.principle.singleresponsibility;

/**
 * @ClassName: SingleRsponsibility1
 * @Author: kunyao
 * @Description: 单一职责原则
 * @Date: 2020/7/16 20:34
 * @Version: 1.0
 */
public class SingleRsponsibility1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("游轮");
    }
}


/**
 * 方式1
 * 1. 在1的方式中，违反了单一职责原则
 */
class Vehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}