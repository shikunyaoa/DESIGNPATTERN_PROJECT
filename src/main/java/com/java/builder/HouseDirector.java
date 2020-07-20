package com.java.builder;

/**
 * @ClassName: HouseDirector
 * @Author: kunyao
 * @Description: 指挥者
 * @Date: 2020/7/20 22:04
 * @Version: 1.0
 */
public class HouseDirector {

    //聚合HouseBuilder
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder builder){
        this.houseBuilder = builder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
