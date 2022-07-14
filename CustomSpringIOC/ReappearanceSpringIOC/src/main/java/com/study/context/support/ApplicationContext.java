package com.study.context.support;

import com.study.beans.BeanFactory;

public interface ApplicationContext extends BeanFactory {
    //加载配置文件，并进行 Bean 对象的创建
    void refresh() throws Exception;
}
