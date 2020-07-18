package com.java.principle.singleresponsibility;

/**
 * @ClassName: SingleRsponsibility1
 * @Author: kunyao
 * @Description: 单一职责原则
 * @Date: 2020/7/16 20:34
 * @Version: 1.0
 */
public class SingleRsponsibility2 {

    public static void main(String[] args) {

        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("游轮");
    }
}


/**
 * 方式2
 * 1. 在2的方式中，遵循了单一职责原则
 * 2. 改动较大
 */
class RoadVehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}


class AirVehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在天上飞");
    }
}

class WaterVehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在水里运行");
    }
}