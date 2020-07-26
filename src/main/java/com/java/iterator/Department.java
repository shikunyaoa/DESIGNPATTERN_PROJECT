package com.java.iterator;

/**
 * @ClassName: Department
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/26 20:11
 * @Version: 1.0
 */
public class Department {

    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
