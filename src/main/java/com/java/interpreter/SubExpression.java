package com.java.interpreter;

import java.util.HashMap;

/**
 * @ClassName: AddExpression
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/28 20:41
 * @Version: 1.0
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)  - super.right.interpreter(var);
    }
}
