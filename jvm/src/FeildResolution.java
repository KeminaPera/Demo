import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * TODO:该类的功能描述
 *
 * @author KeminaPera
 * @date 2019/10/27 12:04
 */
public class FeildResolution {
    private FileInputStream fis = new FileInputStream("fis");
    public FeildResolution() throws FileNotFoundException {
    }

    interface Interface0 {
        int A = 0;
    }
    interface  Interface1 extends Interface0 {
        int A = 1;
    }

    interface  Interface2 {
        int A = 2;
    }

    static class Parent implements Interface1 {
        public static int A = 3;
    }
    static class Sub extends Parent {
        //public static int A = 4;
    }

    public static void main(String[] args) {
        String name = "zhangsansan";
        for (int i = 0; i < 10; i++) {
            System.out.println("找到了這個數");
        }
        System.out.println(Sub.A);
    }
}
