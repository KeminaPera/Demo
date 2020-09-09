package com.keminapera.threadpool.test2;

import org.reflections.Reflections;

import java.util.Set;

/**
 * @author KangPeng
 * @since
 */
public class ExetractorManager {
    public static void main(String[] args) {
        Reflections reflections = new Reflections("com.keminapera.threadpool.test2");
        Set<Class<?>> set = reflections.getTypesAnnotatedWith(Appraisal.class);
        System.out.println(set.size());
    }
    static class ExtractorHandler{
        //static Map<Pattern, exetra>
    }
}
