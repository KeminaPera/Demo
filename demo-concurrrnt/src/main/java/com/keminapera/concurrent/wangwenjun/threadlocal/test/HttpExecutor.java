package com.keminapera.concurrent.wangwenjun.threadlocal.test;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/21 下午10:45
 */
public class HttpExecutor implements Executor {
    @Override
    public void execute() {
        try {
            Context context = ThreadLocalContext.getContext();
            Thread.sleep(1_000);
            context.setCardId(Thread.currentThread().getName() + "线程设置的值 12343242353");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
