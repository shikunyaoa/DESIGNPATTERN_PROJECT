package com.java.flyweight;

/**
 * @ClassName: ConcreteWebSite
 * @Author: kunyao
 * @Description: 享元模式 - 具体对象的实现类
 * @Date: 2020/7/24 21:33
 * @Version: 1.0
 */
public class ConcreteWebSite extends WebSite {

    private String type = ""; //网站发布的类型

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站发布的类型" + type);
    }
}
