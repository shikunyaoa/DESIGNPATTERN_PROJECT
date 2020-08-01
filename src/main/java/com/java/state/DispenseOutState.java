package com.java.state;

/**
 * @ClassName: DispenseOutState
 * @Author: kunyao
 * @Description: 状态模式 - 没有奖品可以发放状态
 * @Date: 2020/8/1 10:59
 * @Version: 1.0
 */
public class DispenseOutState implements State {

    private RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
