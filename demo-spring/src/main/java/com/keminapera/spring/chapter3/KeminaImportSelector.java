package com.keminapera.spring.chapter3;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/19 下午10:54
 */
public class KeminaImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("----------------------------------");
        String[] memberClassNames = importingClassMetadata.getMemberClassNames();
        for (String memberClassName : memberClassNames) {
            System.out.println(memberClassName);
        }
        return new String[]{"com.keminapera.spring.chapter3.Dog"};
    }
}
