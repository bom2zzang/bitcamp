// ## 키보드로부터 입력 받기 - 연습4
// - 다음과 같이 사용자로부터 이름, 이메일, 전화를 입력받아 출력하시오!
// - 실행 예) 
// 이름? 홍길동
// 이메일? hong@test.com
// 전화? 1111-1111
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 임꺽정
// 이메일? leem@test.com
// 전화? 1111-1112
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 유관순
// 이메일? yoo@test.com
// 전화? 1111-1113
// 저장하시겠습니까?(y/n) n
// 저장 취소하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 안중근
// 이메일? ahn@test.com
// 전화? 1111-1114
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) n
// ------------------------------
// 홍길동     hong@test.com 1111-1111
// 임꺽정     leem@test.com 1111-1112
// 안중근      ahn@test.com 1111-1114
// > 

package bitcamp.java100.test21;

import java.io.Console;

public class Test21_5_2 {

    public static void main(String[] args) {
        //구구단
        class Ggd{
            int x;
        }
        
        Console console = System.console();
       Ggd g = new Ggd();
       g.x = Integer.parseInt(console.readLine("구구단?"));
       
       if(1<g.x && g.x<10) {
           System.out.printf("%d단\n",g.x);
           for(int j = 1; j < 10; j++)
               System.out.printf("%d x %d = %d\n",g.x,j,g.x*j);
       }
       else if (g.x < 0) System.out.println("bye");
       else System.out.println("ggg");
    }
}











