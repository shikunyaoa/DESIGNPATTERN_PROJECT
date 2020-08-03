package com.java.iterator;

import java.util.Iterator;

/**
 * @ClassName: ComputerCollegeIterator
 * @Author: kunyao
 * @Description: 迭代器模式 - 数组型迭代器
 * @Date: 2020/7/26 20:13
 * @Version: 1.0
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments; //要遍历的数据
    int position = 0; //遍历的位置


    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }


    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }


    @Override
    public void remove(){

    }
}
