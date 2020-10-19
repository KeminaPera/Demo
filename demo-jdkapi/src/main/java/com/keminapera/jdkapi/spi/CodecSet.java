package com.keminapera.jdkapi.spi;


public interface CodecSet {
    Encoder getEncoder(String encodingName);
    Decoder getDecoder(String encodingName);
}
//提供解码功能的接口
interface Decoder {}
//提供编码功能的接口
interface Encoder {}
