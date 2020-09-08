package com.keminapera.concurrent.wangwenjun.threadlocal.test;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/21 下午10:46
 */
public class Task implements Runnable {
    private DatabaseExecutor dbExecutor = new DatabaseExecutor();
    private HttpExecutor httpExecutor = new HttpExecutor();
    @Override
    public void run() {
        dbExecutor.execute();
        httpExecutor.execute();
        Context context = ThreadLocalContext.getContext();
        System.out.println("流程执行完毕，获取到的数据是" + context.getName() + " " + context.getCardId());
    }
}
