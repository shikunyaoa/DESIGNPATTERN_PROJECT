package com.java.prototype.deepClone;

import java.io.Serializable;

/**
 * @ClassName: DeepCloneableTarget
 * @Author: kunyao
 * @Description: 深拷贝案例
 * @Date: 2020/7/20 21:03
 * @Version: 1.0
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
