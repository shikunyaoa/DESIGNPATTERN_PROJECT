package com.java.proxy.static_proxy;

/**
 * @ClassName: TeacherDao
 * @Author: kunyao
 * @Description: 静态代理 - 目标对象实现类
 * @Date: 2020/7/25 9:57
 * @Version: 1.0
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("正在授课");
    }
}
