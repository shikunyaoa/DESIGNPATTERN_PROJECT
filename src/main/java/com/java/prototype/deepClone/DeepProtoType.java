package com.java.prototype.deepClone;

import java.io.*;

/**
 * @ClassName: DeepProtoType
 * @Author: kunyao
 * @Description: 深拷贝实际应用
 * @Date: 2020/7/20 21:10
 * @Version: 1.0
 */
public class DeepProtoType {

    public String name; //String属性
    public DeepCloneableTarget deepCloneableTarget; //引用类型
    public DeepProtoType(){
        super();
    }

    /**
     * 深拷贝 - 方式1 使用clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //先对基本数据类型进行克隆
        deep = super.clone();
        //再对引用数据类型进行处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }


    /**
     * 深拷贝 - 方式2，序列化
     * @return
     */
    public Object deepClone(){

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;


        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {

            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
