// ## 반복문 
//for(:)
// 

package bitcamp.java100;

public class Test16_7 {

    public static void main(String[] args) {
        //for(:) 문의 용도 및 기본문법

        String[] names = {"홍길동","임꺽정","유관순","안중근","윤봉길"};
        for(String n : names)
            System.out.println(n);
        
        System.out.println("------------------------");
        //거꾸로반복 안됨
        
        int[] kor = {100, 90, 80, 90, 50, 80};
        for(int score : kor) {
            System.out.println(score);
        }

        System.out.println("------------------------");
        
        //컬렉션객체에서 값을 꺼내기
        java.util.ArrayList<String> list = new java.util.ArrayList<>(); 
        list.add("홍길동");
        list.add("안중근");
        list.add("유관순");
        list.add("임꺽정");
        list.add("윤봉길");
        
        for(String n : list) {
            System.out.println(n);
        }
        

        System.out.println("------------------------");
        
        //Set
        java.util.HashSet<String> set = new java.util.HashSet<>(); 
        set.add("홍길동");
        set.add("안중근");
        set.add("유관순");
        set.add("임꺽정");
        set.add("윤봉길");
        
        for(String n : set) {
            System.out.println(n);
        }
        
        
     
    

    }
}


























