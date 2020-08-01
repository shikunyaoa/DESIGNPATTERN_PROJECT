package com.java.responsibilityChain;

/**
 * @ClassName: DepartmentApprover
 * @Author: kunyao
 * @Description: 职责链模式 - 处理者实现类 - 部门
 * @Date: 2020/8/1 17:52
 * @Version: 1.0
 */
public class DepartmentApprover extends Approver {


    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice() <= 5000){
            System.out.println("请求编号id=" + request.getId() + "被" + this.name + " 处理");
        }else{
            //大于5000的处理不了，让下一位处理者处理
            approver.processRequest(request);
        }
    }
}
