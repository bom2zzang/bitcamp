// ## 비트연산자
// - 비트연산자의 사용법을 알아보자!
//

package bitcamp.java100;

public class Test15_10 {
 
    public static void main(String[] args) {
        int v1 = 0b0101_1100;
        int v2 = 0b0110_0110;
        
        int result = v1 & v2;
        
        System.out.println(java.lang.Integer.toBinaryString( result ));
                               //2진수로 표현(java.lang.부품.기능명)
    }
}
