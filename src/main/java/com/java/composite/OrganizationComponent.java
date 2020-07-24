package com.java.composite;

/**
 * @ClassName: OrganizationComponent
 * @Author: kunyao
 * @Description: 组合模式
 * @Date: 2020/7/24 15:21
 * @Version: 1.0
 */
public abstract class OrganizationComponent {

    private String name;
    private String des;

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected abstract void print();
}
