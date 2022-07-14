package com.study.ruin;

import com.study.demo5.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BySerialized {
    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        //获取输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serialized.txt"));
        //将对象序列化
        oos.writeObject(instance);
        oos.close();
        //进行反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serialized.txt"));
        Singleton singleton = (Singleton) ois.readObject();
        ois.close();
        //破环了单例
        System.out.println(singleton);
        System.out.println(instance);
        //可在单例中添加 readResolve()方法，反序列化时检查到有该方法会自动调用该方法创建对象。
    }
}
