package com.java.builder;

/**
 * @ClassName: HouseBuilder
 * @Author: kunyao
 * @Description: 抽象的建造者
 * @Date: 2020/7/20 21:59
 * @Version: 1.0
 */
public abstract class HouseBuilder {
    //组合House
    protected House house = new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
