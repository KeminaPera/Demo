package com.keminapera.mockito.mock00;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/18 下午10:11
 */
public class Main {
    private Guest guest;

    public Main(Guest guest) {
        this.guest = guest;
    }
    public void printer(String content) {
        guest.print(content);
    }

    public String convertUpper(String lowercase) {
        return guest.toUpper(lowercase);
    }

    public void getContentFromDb() {
        guest.getContentFromDb();
    }
}
