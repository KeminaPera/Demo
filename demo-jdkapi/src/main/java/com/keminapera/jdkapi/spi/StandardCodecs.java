package com.keminapera.jdkapi.spi;

/**
 * @author keminapera
 * @date 2020/10/12
 */
public class StandardCodecs implements CodecSet {
    @Override
    public Encoder getEncoder(String encodingName) {
        return new DefaultEncoder();
    }
    @Override
    public Decoder getDecoder(String encodingName) {
        return new DefaultDecoder();
    }
}
//编码的默认实现
class DefaultEncoder implements Encoder {}
//解码的默认实现
class DefaultDecoder implements Decoder {}
