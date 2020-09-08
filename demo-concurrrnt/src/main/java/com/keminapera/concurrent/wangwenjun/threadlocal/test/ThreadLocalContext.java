package com.keminapera.concurrent.wangwenjun.threadlocal.test;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/21 下午11:00
 */
public class ThreadLocalContext {

    public static Context getContext() {
        return ThreadLocalContextHolder.getHolder().get();
    }

    static class ThreadLocalContextHolder{
        private static ThreadLocal<Context> threadLocal = ThreadLocal.withInitial(Context::new);

        public static ThreadLocal<Context> getHolder() {
            return threadLocal;
        }
    }
}
