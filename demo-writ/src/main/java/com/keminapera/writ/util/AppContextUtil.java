package com.keminapera.writ.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * AppContextUtil.
 * 类职责描述：获取spring容器，提供相应操作容器方法.
 *
 * @author wangning on 2018/11/26 15:33.
 * @version 2.0.0.
 * @since jdk 1.8.
 */
@Component("appContextUtil")
public class AppContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * {@inheritDoc}
     *
     * 完成功能：实现set容器属性方法.
     * @author wangning on 2018/11/26 15:39.
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        AppContextUtil.setApplicationCon(applicationContext);
    }

    /**
     * 完成功能：将容器对象赋予AppContextUtil的applicationContext属性.
     * @author wangning on 2018/11/26 15:39.
     * @param applicationContext 容器对象.
     */
    private static void setApplicationCon(ApplicationContext applicationContext) {
        if (AppContextUtil.applicationContext == null) {
            AppContextUtil.applicationContext = applicationContext;
        }
    }

    /**
     * 完成功能：获取容器对象.
     *
     * @author wangning on 2018/11/26 15:47.
     * @return ApplicationContext 容器对象实例.
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 完成功能：是否包含bean.
     *
     * @author wangning on 2018/12/10 14:38.
     * @param name bean的id.
     * @return 判断结果.
     */
    public static boolean containsBean(String name) {
        return getApplicationContext().containsBean(name);
    }


    /**
     * 完成功能：根据bean名称获取bean对象.
     *
     * @author wangning on 2018/11/26 15:40.
     * @param bean 要查找的bean名称.
     * @param <T> a T object.
     * @return Object 对应的容器对象.
     */
    public static <T> T getBean(String bean){
        return containsBean(bean) ? (T) getApplicationContext().getBean(bean) : null;
    }

    /**
     * 完成功能：通过class获取Bean对象.
     *
     * @author wangning on 2018/11/26 15:48.
     * @param clazz a {@link Class} object.
     * @param <T> a T object.
     * @return <T> 对应bean对象.
     */
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    /**
     * 完成功能：通过class和bean名称获取Bean对象.
     *
     * @author wangning on 2018/11/26 15:49.
     * @param name 要查找的bean名称.
     * @param clazz a {@link Class} object.
     * @param <T> a T object.
     * @return <T>和名称 对应bean对象.
     */
    public static <T> T getBean(String name, Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }


    /**
     * 完成功能：获取实现类.
     *
     * @author wangning on 2018/12/10 09:50.
     * @param var0 superclass.
     * @param <T> a T object.
     * @return 实现类map.
     */
    public static <T> Map<String, T> getBeanOfType(Class var0) {
        return getApplicationContext().getBeansOfType(var0);
    }

    /**
     * 完成功能：获取实现类.
     *
     * @author wangning on 2018/12/10 09:53.
     * @param var0 superclass.
     * @param <T> a T object.
     * @return 实现类list.
     */
    public static <T> List<T> getBeanListOfType(Class<T> var0) {
        ArrayList arrayList = new ArrayList();
        Map beanOfType = getBeanOfType(var0);
        Iterator iterator = beanOfType.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry entry = (Entry)iterator.next();
            arrayList.add(entry.getValue());
        }

        return arrayList;
    }
}
