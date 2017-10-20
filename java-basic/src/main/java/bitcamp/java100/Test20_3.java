// 래퍼객체
//


package bitcamp.java100;

import java.io.File;

public class Test20_3 {
    
    static void print1(String value) {
        System.out.println(value);
    }
    
    static void print2(int value) {
        System.out.println(value);
    }

    static void print3(float value) {
        System.out.println(value);
    }
    
    static void print4(Object value) {
        System.out.println(value);
    }
    
    public static void main (String[] args)  { 
        print1("문자열");
        print2(300);
        print3(3.14f);
        print4(3.14f +"dfd");
        
        
        String v1 = "홍길동";
        StringBuffer v2 = new StringBuffer("임꺽정");
        File v3 = new File(".");

        print4(v1);
        print4(v2);
        print4(v3);
        print4(true);
        print4(123);
        print4(v3);
        

    }
}
























