package com.java.principle.singleresponsibility;

/**
 * @ClassName: SingleRsponsibility1
 * @Author: kunyao
 * @Description: 单一职责原则
 * @Date: 2020/7/16 20:34
 * @Version: 1.0
 */
public class SingleRsponsibility3 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("游轮");
    }
}


/**
 * 方式3
 * 1. 改动小
 * 2. 在方法的角度任然遵循了单一职责原则
 */
class Vehicle2{

    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + "在天上飞");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + "在水里运行");
    }
}