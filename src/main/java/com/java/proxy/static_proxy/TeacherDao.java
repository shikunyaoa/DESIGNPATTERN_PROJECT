package com.java.proxy.static_proxy;

/**
 * @ClassName: TeacherDao
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/25 9:57
 * @Version: 1.0
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("正在授课");
    }
}
