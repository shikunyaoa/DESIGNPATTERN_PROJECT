package com.java.responsibilityChain;

/**
 * @ClassName: Approver
 * @Author: kunyao
 * @Description: 职责链模式 - 处理者抽象类
 * @Date: 2020/8/1 17:49
 * @Version: 1.0
 */
public abstract class Approver {

    Approver approver; //下一个处理者
    String name; //名字

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理请求的方法,子类实现
    public abstract void processRequest(PurchaseRequest request);
}
