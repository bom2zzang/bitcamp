// ## 비트연산자 이동 연산자( >>, >>>, <<) 응용
// - 비트연산자의 사용법을 알아보자!
//

package bitcamp.java100;

public class Test15_12_2 {
 
    public static void main(String[] args) {
        
        //문제: int 메모리에 들어있는 값을 1바이트씩 앞에서 부터 출력 하라.
        int v = 1_234_567_890;
        
        System.out.println(Integer.toHexString(v)); //전체 바이트 출력
        System.out.println(Integer.toHexString(v >> 24));
        System.out.println(Integer.toHexString((v >> 16) & 0xFF));
        System.out.println(Integer.toHexString((v >> 8) & 0xFF));
        System.out.println(Integer.toHexString((v >> 4) & 0xFF ));

      
        
    }
    
}
