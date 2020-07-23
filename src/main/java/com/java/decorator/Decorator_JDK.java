package com.java.decorator;

import java.io.*;

/**
 * @ClassName: Decorator_JDK
 * @Author: kunyao
 * @Description: 装饰者模式在JDK中的应用
 * @Date: 2020/7/23 21:06
 * @Version: 1.0
 */
public class Decorator_JDK {

    public static void main(String[] args) throws FileNotFoundException {

        //DataInputStream的父类FilterInputStream就是装饰器父类
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(""));
    }
}
