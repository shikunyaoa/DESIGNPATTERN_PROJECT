package com.java.interpreter;

import java.util.HashMap;

/**
 * @ClassName: VarExpression
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/28 20:35
 * @Version: 1.0
 */

/**
 * 变量的解释器
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }


    /**
     * 根据变量的名称获取对应的值
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
