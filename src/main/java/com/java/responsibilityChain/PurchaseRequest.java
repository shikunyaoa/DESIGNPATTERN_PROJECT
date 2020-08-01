package com.java.responsibilityChain;

/**
 * @ClassName: PurchaseRequest
 * @Author: kunyao
 * @Description: 职责链模式 - 请求类
 * @Date: 2020/8/1 17:46
 * @Version: 1.0
 */
public class PurchaseRequest {

    private int type = 0; //请求类型
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
