package com.keminapera.thread.file;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterTask implements Runnable {
    private final String content;
    private final String filePath;

    public FileWriterTask(String content, String filePath) {
        this.content = content;
        this.filePath = filePath;
    }

    @SneakyThrows
    @Override
    public void run() {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try(FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(content.getBytes());
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
