package com.java.template;

/**
 * @ClassName: SoyaMilk
 * @Author: kunyao
 * @Description: 黄豆豆浆抽象类 -- 模板设计模式
 * @Date: 2020/7/25 16:55
 * @Version: 1.0
 */
public abstract class SoyaMilk {

    //模板方法,make, 模板方法可以做成final，不让子类覆盖
    final void make(){
        select();
        if(customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    //选材料
    void select(){
        System.out.println("选择好的新鲜黄豆");
    }

    //添加不同的材料，抽象方法, 子类具体实现
    abstract void addCondiments();

    void soak(){
        System.out.println("黄豆和配料开始浸泡");
    }

    void beat(){
        System.out.println("黄豆和配料放到豆浆机打碎");
    }


    //钩子方法，决定是否需要添加材料
    boolean customerWantCondiments(){
        return true;
    }
}
