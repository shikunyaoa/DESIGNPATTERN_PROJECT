package com.java.responsibilityChain;

/**
 * @ClassName: CollegeApprover
 * @Author: kunyao
 * @Description: 职责链模式 - 处理者实现类 - 学院
 * @Date: 2020/8/1 17:55
 * @Version: 1.0
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice() > 5000 && request.getPrice() <= 10000){
            System.out.println("请求编号id=" + request.getId() + "被" + this.name + " 处理");
        }else{
            //大于5000的处理不了，让下一位处理者处理
            approver.processRequest(request);
        }
    }
}
