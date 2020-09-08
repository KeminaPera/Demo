package com.keminapera.spring.resource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.*;
import java.net.MalformedURLException;
import java.util.Date;

public class TestResource {
    @Test
    public void testFileSystemResource() throws IOException {
        FileSystemResource resource = new FileSystemResource("/home/keminapera/hello.txt");
        String path = resource.getPath();
        System.out.println(new Date(resource.lastModified()));
        byte[] buffer = new byte[1000];
        try(InputStream inputStream = resource.getInputStream();) {
            inputStream.read(buffer);
        }
        String s = new String(buffer);
        System.out.println(s);
        System.out.println(path);
    }

    @Test
    public void testClassPathResource() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("classpath:hello.md");
        File file = resource.getFile();
        long l = resource.contentLength();
        System.out.println(l);
        String path = file.getPath();
        System.out.println(path);
    }

    @Test
    public void urlResource() throws MalformedURLException, FileNotFoundException {
        UrlResource resource = new UrlResource("https://dss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/topnav/zhidao@2x-e9b427ecc4.png");
        byte[] buffer = new byte[1000];
        int start = buffer.length;
        FileOutputStream fos = new FileOutputStream("/home/keminapera/resource.png");
        try(InputStream inputStream = resource.getInputStream()) {
            while ((start = inputStream.read(buffer, 0, start)) != -1) {
                fos.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFileSystemResource2() throws IOException {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
        Resource resource1 = context.getResource("file:/home/keminapera/hello.txt");
        System.out.println(resource1.contentLength());
        Resource resource = context.getResource("classpath:hello.md");
        long l = resource.contentLength();
        System.out.println(l);
    }
}
