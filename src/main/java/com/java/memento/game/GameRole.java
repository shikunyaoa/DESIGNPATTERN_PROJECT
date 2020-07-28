package com.java.memento.game;

/**
 * @ClassName: GameRole
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/28 19:43
 * @Version: 1.0
 */
public class GameRole {

    private int vit;
    private int def;

    //保存游戏角色状态
    public Memento createMemento(){
        return new Memento(vit, def);
    }

    //恢复游戏角色状态
    public void recoverGameRole(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }


}
