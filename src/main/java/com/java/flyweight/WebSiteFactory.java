package com.java.flyweight;

import java.util.HashMap;

/**
 * @ClassName: WebSiteFactory
 * @Author: kunyao
 * @Description: 享元模式 - 具体对象的工厂类 - 相当于对象池
 * @Date: 2020/7/24 21:35
 * @Version: 1.0
 */
public class WebSiteFactory {

    //集合，充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据类型，返回一个网站，如果没有就创建一个放入池中并返回

    public WebSite getWebSiteCategroy(String type){
        if(!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));

        }
        return (WebSite)pool.get(type);
    }
}
