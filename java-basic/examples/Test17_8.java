// ## 메서드 -  기본 기본 1
//
// 

package bitcamp.java100;

public class Test17_8 {
   
    static class Member{
        String name;
        int age;
        boolean working;
        float score;
        char level;
    }
    static Member m1() {
        Member ref = new Member();
        ref.name = "홍길동";
        ref.age = 28;
        ref.working = false;
        ref.score = 4.12f;
        ref.level = 'M'; //M이라는 문자의 유니코드값을 저장한다.
        
        return ref;
        
    }
    
    public static void main (String[] args) {
       Member mem = m1();
       
       System.out.println(mem.name);
       System.out.println(mem.age);
       System.out.println(mem.working);
       System.out.println(mem.score);
       System.out.println(mem.level);
       }
     
        
        
    }
























