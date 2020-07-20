package com.java.builder;

/**
 * @ClassName: CommonHouse
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/20 22:02
 * @Version: 1.0
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
