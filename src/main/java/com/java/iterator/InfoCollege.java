package com.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: InfoCollege
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/26 20:37
 * @Version: 1.0
 */
public class InfoCollege implements College {

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
