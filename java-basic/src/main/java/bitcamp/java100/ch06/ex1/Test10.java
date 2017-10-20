package bitcamp.java100.ch06.ex1;

//사용자정의데이터타입
public class Test10 {
    public static void main(String[] args) {
        
        Score9 score;
        score = new Score9();
        score = new Score9("홍길동");
        

        System.out.printf("이름=%s\n",score.name);
        System.out.printf("총점=%s\n",score.sum);
        System.out.printf("평균=%s\n",score.aver);
        
        
        
    
    }
    
    
    

}
