package com.keminapera.concurrent.wangwenjun.readwrite;

import java.util.ArrayList;
import java.util.List;

public class ShareData {
    private volatile List<String> nameList;
    private final ReadWriteLock lock = new ReadWriteLock();

    public ShareData() {
        this.nameList = new ArrayList<>(100);
    }

    public String read() throws InterruptedException {
        lock.readLock();
        int size = nameList.size();
        lock.readUnlock();
        return String.valueOf(size);
    }

    public void write(String element) throws InterruptedException {
        lock.writeLock();
        nameList.add(element);
        lock.writeUnlock();
    }
}
