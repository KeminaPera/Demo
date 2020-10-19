package com.keminapera.spring.resourceloader;

import org.junit.Test;
import org.springframework.core.io.ClassRelativeResourceLoader;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class TestResourceLoader {
    @Test
    public void testResourceLoader() throws IOException {
        FileSystemResourceLoader resourceLoader = new FileSystemResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:hello.md");
        if (resource.exists()){
            System.out.println(resource.contentLength());
        }
        System.out.println(resource.getFilename() + " does not exist!!!");
    }

    /**
     * 相对于
     * @throws IOException IOException
     */
    @Test
    public void testClassPathResourceLoader() throws IOException {
        ClassRelativeResourceLoader classPathResourceLoader = new ClassRelativeResourceLoader(TestResourceLoader.class);
        Resource resource = classPathResourceLoader.getResource("/hello.md");
        System.out.println(resource.contentLength());
    }
}
