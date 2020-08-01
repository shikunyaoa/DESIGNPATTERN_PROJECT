package com.java.state;

/**
 * @ClassName: DispenseState
 * @Author: kunyao
 * @Description: 状态模式 - 发放奖品
 * @Date: 2020/8/1 10:54
 * @Version: 1.0
 */
public class DispenseState implements State {

    private RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrice() {
        if(activity.getCount() > 0){
            System.out.println("恭喜中奖了");
            activity.setState(activity.getNoRaffleState());
        }else{
            System.out.println("很遗憾，奖品发送完了");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
