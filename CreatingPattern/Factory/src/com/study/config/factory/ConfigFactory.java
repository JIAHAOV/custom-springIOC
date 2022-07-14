package com.study.config.factory;

import com.study.config.product.AbstractProduct;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 通过工厂模式+配置文件的方式解除工厂对象和产品对象的耦合。
 * 在工厂类中加载配置文件中的全类名，并创建对象进行存储，客户端如果需要对象，直接进行获取即可。
 */
public class ConfigFactory {
    //用来存储创建的对象
    private static final Map<String, AbstractProduct> map = new HashMap<>();

    //初始化对象
    static {
        //创建 properties 加载配置文件
        Properties properties = new Properties();
        //获取输入流
        try (InputStream inputStream = ConfigFactory.class.getClassLoader().getResourceAsStream("bean.properties")) {
            //加载配置文件
            properties.load(inputStream);
            for (Object key : properties.keySet()) {
                //遍历配置文件
                String beanName = (String) key;
                String classPath = properties.getProperty(beanName);
                Class< ? > clazz = Class.forName(classPath);
                //根据类路径创建对象
                AbstractProduct instance = (AbstractProduct) clazz.getConstructor().newInstance();
                //将对象放入 map
                map.put(beanName, instance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取创建的对象
    public static AbstractProduct getBean(String beanName) {
        return map.get(beanName);
    }

}
