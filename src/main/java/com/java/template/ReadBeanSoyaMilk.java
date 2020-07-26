package com.java.template;

/**
 * @ClassName: ReadBeanSoyaMilk
 * @Author: kunyao
 * @Description: 红豆豆浆
 * @Date: 2020/7/25 17:00
 * @Version: 1.0
 */
public class ReadBeanSoyaMilk extends SoyaMilk {


    @Override
    void addCondiments() {
        System.out.println("选用红豆");
    }
}
