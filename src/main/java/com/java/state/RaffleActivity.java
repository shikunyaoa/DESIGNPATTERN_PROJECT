package com.java.state;

/**
 * @ClassName: RaffleActivity
 * @Author: kunyao
 * @Description:  状态模式 - 抽奖活动
 * @Date: 2020/8/1 10:37
 * @Version: 1.0
 */
public class RaffleActivity {


    State state = null; //state 表示活动当前状态
    int count = 0;

    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public void debuctMoney(){
        state.deductMoney();
    }

    public void raffle(){
        if(state.raffle()){
            state.dispensePrice();
        }
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }

    public int getCount(){
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count){
        this.count = count;
    }


    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
