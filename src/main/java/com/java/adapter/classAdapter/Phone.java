package com.java.adapter.classAdapter;

/**
 * @ClassName: Phone
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/22 20:07
 * @Version: 1.0
 */
public class Phone {

    public void chaging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        }
    }
}
