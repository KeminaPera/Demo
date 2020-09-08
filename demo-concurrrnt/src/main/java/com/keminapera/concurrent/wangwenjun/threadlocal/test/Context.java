package com.keminapera.concurrent.wangwenjun.threadlocal.test;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/21 下午10:44
 */
public class Context {
    private String name;
    private String cardId;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name + "===" + Thread.currentThread().getName();
    }

    public void setCardId(String cardId) {
        this.cardId = cardId + "===" + Thread.currentThread().getName();
    }
    public String getCardId() {
        return this.cardId;
    }
}
