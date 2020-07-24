package com.java.composite;

/**
 * @ClassName: Department
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/24 15:35
 * @Version: 1.0
 */
public class Department extends OrganizationComponent {


    public Department(String name, String des) {
        super(name, des);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
