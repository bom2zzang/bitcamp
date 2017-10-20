// ## 메서드 -  기본 기본 1
//
// 

package bitcamp.java100;

public class Test17_4 {
   
    static void m1(int... values) {
        System.out.printf("아규먼트 개수 : \n", values.length);
        for(int v : values) {
            System.out.println(v);
        }
        System.out.println( );
        System.out.println("----------------------------");
        
       
    }
    static void m2(String name, int age, int... values) {}
    static void sum(int... values) {
        int s = 0;
        for(int v : values) {
            s+= v;
        }
        System.out.printf("합계 : %d\n", s);
    }
    
    
    public static void main (String[] args) {
     m1();
     m1(213);
     m1(2,22,222);
     m1(12);
     sum();
     sum(3,5,8,456);
     sum(121254,5,4545);
     sum(4,2,4);
     sum(12,3);
    }


}























