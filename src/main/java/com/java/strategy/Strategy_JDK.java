package com.java.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName: Strategy_JDK
 * @Author: kunyao
 * @Description: 策略模式在JDK中的应用
 * @Date: 2020/8/1 17:08
 * @Version: 1.0
 */
public class Strategy_JDK {

    public static void main(String[] args) {
        Integer[] data = {0, 1, 2, 3, 4, 5};
        //Comparator就是策略接口
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return 1;
                }else if(o1.equals(o2)){
                    return 0;
                }else{
                    return -1;
                }

            }
        };

        Arrays.sort(data, integerComparator);
    }
}
