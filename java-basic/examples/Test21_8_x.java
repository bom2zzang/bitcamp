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
import java.util.ArrayList;

public class Test21_8_x {

    public static void main(String[] args) {
        class Info{
            String name;
            String mail;
            String num;
        }
        
        Console console = System.console();
        Info i = new Info();

        ArrayList names = new ArrayList();
        ArrayList mails = new ArrayList();
        ArrayList nums = new ArrayList();
        
        while(true) {
            i.name = console.readLine("이름?");
            i.mail = console.readLine("메일?");
            i.num = console.readLine("번호?");
            
            if(console.readLine("저장?(y/n").equals("y")==true) {
            names.add(i.name);
            mails.add(i.mail);
            nums.add(i.num);
            System.out.println("저장완료");
        }
            else System.out.println("취소");
        

            if(console.readLine("계속?(y/n").equals("y")==true)
                continue;
            else break;
               
        }
        System.out.println();
        for(int k = 0; k < names.size(); k++) {
            System.out.printf("%s\t",names.get(k));
            System.out.printf("%s\t",mails.get(k));
            System.out.printf("%s\n",nums.get(k));
        }
        
        
    }
}











