package bitcamp.java100.ch06.ex1;

public class Score7 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score7(){
        this("홍길동");
        /*this.name = "홍길동";
        this.kor = 100;
        this.eng = 100;
        this.math = 100;*/
        
        this.compute();
        
    }
    
    Score7(String name){
        //System.out.println("Score7(String)");
        this(name, 100, 100, 100);
        /*this.name = name;
        this.kor = 100;
        this.eng = 100;
        this.math = 100;*/
        
        this.compute();
    }

    Score7(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }


}
