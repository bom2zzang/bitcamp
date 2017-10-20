package bitcamp.java100.ch06.ex1;

//사용자정의데이터타입
public class Test5 {
    public static void main(String[] args) {
        
        Score4 score;
        //score= new Score4();
        score= new Score4("임꺽정", 100, 80, 70);
        score.compute();

        System.out.printf("이름=%s\n",score.name);
        System.out.printf("총점=%s\n",score.sum);
        System.out.printf("평균=%s\n",score.aver);
    
     
        
        
        
    
    }
    
    
    

}
