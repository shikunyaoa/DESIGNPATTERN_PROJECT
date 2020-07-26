package com.java.iterator;

import java.util.Iterator;

/**
 * @ClassName: ComputerCollege
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/26 20:24
 * @Version: 1.0
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0; //保存当前数组的元素个数

    public ComputerCollege(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String getName() {
        return "computer";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
