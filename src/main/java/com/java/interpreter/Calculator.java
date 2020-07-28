package com.java.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName: Calculator
 * @Author: kunyao
 * @Description: 解释器模式 - 上下文
 * @Date: 2020/7/28 20:48
 * @Version: 1.0
 */
public class Calculator {

    //定义表达式
    private Expression expression;

    //构造函数传参，并解析
    public Calculator(String expStr){

        //安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length ; i++) {
            switch (charArray[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[++i])));
                    break;
            }
        }

        this.expression = stack.pop();
    }


    public int run(HashMap<String, Integer> var){
        return this.expression.interpreter(var);
    }
}
