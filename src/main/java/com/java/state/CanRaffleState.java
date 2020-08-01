package com.java.state;

import java.util.Random;

/**
 * @ClassName: CanRaffleState
 * @Author: kunyao
 * @Description: 状态模式 - 可以抽奖状态
 * @Date: 2020/8/1 10:48
 * @Version: 1.0
 */
public class CanRaffleState implements State {

    private RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等!");
        Random r = new Random();
        int num = r.nextInt(10);
        if(num == 0){
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中奖品!");
            activity.setState(activity.getNoRaffleState());
            return false;
        }

    }

    @Override
    public void dispensePrice() {
        System.out.println("没中奖，不能发放奖品");
    }
}
