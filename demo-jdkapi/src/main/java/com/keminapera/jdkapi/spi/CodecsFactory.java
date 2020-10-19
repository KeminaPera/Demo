package com.keminapera.jdkapi.spi;


import java.util.ServiceLoader;

/**
 * @author keminapera
 * @date 2020/10/12
 */
public class CodecsFactory {
    private static ServiceLoader<CodecSet> codecSetLoader = ServiceLoader.load(CodecSet.class);

    public static Encoder getEncoder(String encodingName) {
        for (CodecSet cp : codecSetLoader) {
            Encoder enc = cp.getEncoder(encodingName);
            if (enc != null) {
                return enc;
            }
        }
        return null;
    }
}
