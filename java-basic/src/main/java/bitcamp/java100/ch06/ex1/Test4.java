package bitcamp.java100.ch06.ex1;

//사용자정의데이터타입
public class Test4 {
    public static void main(String[] args) {
        
        Score3 score;
        score= new Score3();
        
        score.compute();

        System.out.printf("이름=%s\n",score.name);
        System.out.printf("총점=%s\n",score.sum);
        System.out.printf("평균=%s\n",score.aver);
    
    
        //score = new Score3; error
        //score= new Score3("홍길동"); error
        
        
    
    }
    
    
    

}
