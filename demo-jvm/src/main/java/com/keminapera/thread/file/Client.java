package com.keminapera.thread.file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.IntStream;

public class Client {
    //private static  final String filePath = "E:\\Cocall_Workspace\\姜微\\my.txt";
    private static  final String filePath = "E:\\Cocall_Workspace\\姜微\\传唤证3.jpg";
    //private static  final String filePath = "E:\\Cocall_Workspace\\姜微\\扣押清单.pdf";
    //private static  final String filePath = "E:\\Cocall_Workspace\\姜微\\全新部署文档.doc";
    public static void main(String[] args) throws IOException {
        File file = new File(filePath);
        IntStream.rangeClosed(1, 1000).forEach(i -> {
            String targetFilePath = "E:\\Cocall_Workspace\\姜微\\超时案件\\传唤证" + i + ".jpg";
            try(FileOutputStream fos = new FileOutputStream(targetFilePath)) {
                FileUtils.copyFile(file, fos);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
