package com.java.template;

/**
 * @ClassName: PureSoyaMilk
 * @Author: kunyao
 * @Description: 纯豆浆
 * @Date: 2020/7/25 17:10
 * @Version: 1.0
 */
public class PureSoyaMilk extends SoyaMilk {

    /**
     * 不添加任何材料，直接空实现
     */
    @Override
    void addCondiments() {

    }


    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
