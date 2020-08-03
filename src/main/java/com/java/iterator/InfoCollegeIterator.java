package com.java.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: InfoCollegeIterator
 * @Author: kunyao
 * @Description: 迭代器模式 - 集合型迭代器
 * @Date: 2020/7/26 20:18
 * @Version: 1.0
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList;
    int position = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(position >= departmentList.size() - 1){
            return false;
        }else{
            position += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(position);
    }
}
