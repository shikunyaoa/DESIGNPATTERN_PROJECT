package com.java.state;

/**
 * 状态模式 - 抽象接口
 */
public interface State {

    //扣除积分
    public abstract void deductMoney();

    //是否抽中奖品
    public abstract boolean raffle();

    //发放奖品
    public abstract void dispensePrice();
}
