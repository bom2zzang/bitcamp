package bitcamp.java100.ch06.ex1;

public class Score5 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    
    Score5(String name, int kor, int eng, int math){
        System.out.println("Score3() 호출됨!");
        this.name = "홍길동";
        this.kor = 100;
        this.eng = 100;
        this.math = 100;
        this.compute();
    }
    Score5(String name){
        System.out.println("Score5(String)호출됨!");
        this.name = name;
    }
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }


}
