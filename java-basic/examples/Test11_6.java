package bitcamp.java100;

public class Test11_6{        
    public static void main(String[] args){
    
       //정수는 기본 4바이트
       //-2(31승) ~ +2(31승) = -2147483648 ~ +2147483647
        System.out.println(1456781234);
        System.out.println(14_5678_1234);
        System.out.println(1_456_781_234);
        System.out.println(-2147483648);
        System.out.println(2147483647);

        // System.out.println(-2147483649);
        // System.out.println(2147483648);

        //해결책 : 숫자 뒤에 L을 붙인다.
        System.out.println(-2147483649L);
        System.out.println(2147483648L);

        //8바이트 
        System.out.println(-922_3372_0368_5477_5808L);
        System.out.println(922_3372_0368_5477_5807L);

        
        System.out.println(10); //4바이트
        System.out.println(10L);//8바이트

    }
}
