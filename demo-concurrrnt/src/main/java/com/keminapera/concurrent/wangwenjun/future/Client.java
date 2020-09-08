package com.keminapera.concurrent.wangwenjun.future;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/15 下午11:14
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        FutureService<String> service = new FutureService();
        Future<String> future = service.submit(() -> {
            Thread.sleep(10_000);
            return "FINISH";
        });

        System.out.println("do other things...");
        System.out.println("==================");
        System.out.println("获取结果" + future.get());
    }
}
