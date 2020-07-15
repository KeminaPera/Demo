package com.keminapera.concurrent.wangwenjun.observer1;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class SubObserverListener implements ObserverListener {
    private ReentrantLock lock = new ReentrantLock();

    public void execute(List<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return;
        }
        ids.forEach(id -> new Thread(new RunnableObserverListener(this) {
            @Override
            public void run() {
                try {
                    notifyAll1(new Event(StateEnum.RUNNING, Thread.currentThread(), null));
                    Thread.sleep(3000);
                    notifyAll1(new Event(StateEnum.DONE, Thread.currentThread(), null));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    notifyAll1(new Event(StateEnum.ERROR, Thread.currentThread(), e));
                }
            }
        }, id).start());
    }
    @Override
    public void onEvent(RunnableObserverListener.Event event) {
        lock.lock();
        System.out.println("current thread = " + event.getThread().getName() + " state is " + event.getState().name());
        lock.unlock();
    }
}
