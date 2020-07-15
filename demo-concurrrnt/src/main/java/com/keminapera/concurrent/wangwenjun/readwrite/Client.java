package com.keminapera.concurrent.wangwenjun.readwrite;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        ShareData data = new ShareData();
        List<Writer> writerList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Writer writer = new Writer(data);
            writer.setName("Writer-" + i);
            writer.start();
            writerList.add(writer);
        }

        List<Reader> readerList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Reader reader = new Reader(data);
            reader.setName("Reader-" + i);
            readerList.add(reader);
            reader.start();
        }
        Thread.sleep(3000);
        for (Reader reader : readerList) {
            reader.interrupt();
        }
        for (Writer writer : writerList) {
            writer.interrupt();
        }
    }
}
