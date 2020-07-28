package com.java.interpreter;

import java.util.HashMap;

/**
 * @ClassName: SymbolExpression
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/28 20:37
 * @Version: 1.0
 *
 * 抽象运算符号解释器，每个运算符号，都只和自己左右两个数字有关系
 */
public class SymbolExpression extends Expression {

    public  Expression left;
    public Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    /**
     * 因为SymbolExpression是让其子类来实现，因此interpreter是一个默认实现
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
