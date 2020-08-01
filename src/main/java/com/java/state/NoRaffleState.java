package com.java.state;

/**
 * @ClassName: NoRaffleState
 * @Author: kunyao
 * @Description: 状态模式 - 扣除积分
 * @Date: 2020/8/1 10:37
 * @Version: 1.0
 */
public class NoRaffleState implements State {

    //初始化时传入活动引用，扣除积分后改变其状态
    private RaffleActivity acticity;

    public NoRaffleState(RaffleActivity acticity) {
        this.acticity = acticity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功,您可以抽奖了");
        //扣积分后，将状态设置为可以抽奖
        acticity.setState(acticity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔!");
        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("不能发放奖品");
    }
}
