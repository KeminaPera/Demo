package com.keminapera.concurrent.wangwenjun.threadlocal.test;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/21 下午10:46
 */
public class DatabaseExecutor implements Executor {
    @Override
    public void execute() {
        try {
            Thread.sleep(1_000);
            //从数据库获取到数据
            Context context = ThreadLocalContext.getContext();
            context.setName(Thread.currentThread().getName() + "线程设置的值 hello world!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
