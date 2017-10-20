// ## 문장 - 블록
// 블록 사용 , 범위 
// 일반,메서드,클래스,인스턴스,스태틱

package bitcamp.java100;

public class Test16_1 {

    public static void main(String[] args) {
        
        int a = 100;
        {
        int b = 200;
        
        System.out.println(a);
        System.out.println(b);
        
        
    }
        System.out.println(a);
    }
     // System.out.println(b); 컴파일오류
    
}
