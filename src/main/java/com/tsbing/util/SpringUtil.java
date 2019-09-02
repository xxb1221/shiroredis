package com.tsbing.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * Spring上下文工具类
 */
@Component
public class SpringUtil implements ApplicationContextAware {
    private static ApplicationContext context;
    /**
     * Spring在bean初始化后会判断是不是ApplicationContextAware的子类
     * 如果该类是,setApplicationContext()方法,会将容器中ApplicationContext作为参数传入进去
     * @author xiexiaobing
     * @email xiexb1221@163.com
     * @date 2019-09-02
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
    /**
     * 通过Name返回指定的Bean
     * @author xiexiaobing
     * @email xiexb1221@163.com
     * @date 2019-09-02
     */
    public static <T> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }
}
