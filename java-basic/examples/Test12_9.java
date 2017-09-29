package bitcamp.java100;

public class Test12_9{        
    public static void main(String[] args){
        
        char c1, c2;
        c1 = 44032;
        c2 = 0;

        char n1 = 0xc774, n2 = 0xbcf4, n3 =0xBBF8;
        System.out.printf("%c %c %c\n", n1, n2, n3);

        char m1, m2, m3;
        m1 = '옹';
        m2 = '성';
        m3 = '우';
        System.out.printf("%c %c %c\n", m1, m2, m3);

        //문자 7을 숫자 7로 바꿔라
        char x = '7';
        int num;
        // num = (char)x-48;
        num = x - '0';
        System.out.println(num);


    }
}                                                                                                                                                           