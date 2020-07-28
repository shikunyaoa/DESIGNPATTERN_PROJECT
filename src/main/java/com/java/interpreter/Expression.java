package com.java.interpreter;

import java.util.HashMap;

/**
 * @ClassName: Expression
 * @Author: kunyao
 * @Description: 解释器模式 - 表达式抽象类
 * @Date: 2020/7/28 20:30
 * @Version: 1.0
 */
public abstract class Expression {

    public abstract int interpreter(HashMap<String, Integer> var);

}
