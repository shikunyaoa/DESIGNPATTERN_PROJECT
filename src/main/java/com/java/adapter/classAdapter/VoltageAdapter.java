package com.java.adapter.classAdapter;

/**
 * @ClassName: VoltageAdapter
 * @Author: kunyao
 * @Description: 适配器类
 * @Date: 2020/7/22 20:03
 * @Version: 1.0
 */
public class VoltageAdapter extends Voltage220V implements  IVoltage5V {

    /**
     * 将被适配类返回的结果转化为目标需要的结果
     * @return
     */
    @Override
    public int output5V() {
        int srcV = output220();
        int dstV = srcV / 44;
        return dstV;
    }
}
