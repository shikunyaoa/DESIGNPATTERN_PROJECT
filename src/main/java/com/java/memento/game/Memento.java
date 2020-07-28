package com.java.memento.game;

/**
 * @ClassName: Memento
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/28 19:39
 * @Version: 1.0
 */
public class Memento {

    private int vit;
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
