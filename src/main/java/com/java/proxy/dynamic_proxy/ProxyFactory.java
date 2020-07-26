package com.java.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyFactory
 * @Author: kunyao
 * @Description: 动态代理模式
 * @Date: 2020/7/25 10:19
 * @Version: 1.0
 */
public class ProxyFactory {

    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object object) {
        this.target = object;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance(){

        //

        /**
         *  public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *  参数1：指定当前目标对象的类加载器，获取加载器的方法固定
         *  参数2：目标对象实现的接口类型，使用泛型的方式确认类型
         *  参数3：事件处理，执行目标对象的方法时，会触发事件处理器方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始");
                //使用反射机制调用目标对象的方法
                Object invoke = method.invoke(target, args);
                return invoke;
            }
        });
    }
}
