// ## 조건연산자
// - 조건 연산자의 사용법을 알아보자!
//

package bitcamp.java100;

public class Test15_9 {

    public static void main(String[] args) {
        int age = 28;
        //                                     참      :     거짓;
        String result = (age <= 19) ? "미성년" : "성년";
        
        System.out.println(result);

    }
}
