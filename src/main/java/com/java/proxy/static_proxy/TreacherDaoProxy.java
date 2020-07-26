package com.java.proxy.static_proxy;

/**
 * @ClassName: TreacherDaoProxy
 * @Author: kunyao
 * @Description: 静态代理模式
 * @Date: 2020/7/25 9:58
 * @Version: 1.0
 */
public class TreacherDaoProxy implements ITeacherDao {

    private ITeacherDao iTeacherDao;

    public TreacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        iTeacherDao.teach();
        System.out.println("代理结束");
    }

}
