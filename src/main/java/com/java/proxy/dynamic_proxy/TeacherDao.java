package com.java.proxy.dynamic_proxy;

/**
 * @ClassName: TeacherDao
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/25 10:18
 * @Version: 1.0
 */
public class TeacherDao implements ITeacherDao {


    @Override
    public void teach() {
        System.out.println("正在授课");
    }
}
