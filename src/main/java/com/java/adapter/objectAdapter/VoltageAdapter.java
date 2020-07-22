package com.java.adapter.objectAdapter;

/**
 * @ClassName: VoltageAdapter
 * @Author: kunyao
 * @Description: 适配器类
 * @Date: 2020/7/22 20:03
 * @Version: 1.0
 */
public class VoltageAdapter  implements IVoltage5V {

    //对象适配器采用聚合的方式取代继承
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    /**
     * 将被适配类返回的结果转化为目标需要的结果
     * @return
     */
    @Override
    public int output5V() {
        int srcV = voltage220V.output220();
        int dstV = srcV / 44;
        return dstV;
    }
}
