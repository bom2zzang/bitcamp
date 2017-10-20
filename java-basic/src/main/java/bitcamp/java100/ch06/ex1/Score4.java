package bitcamp.java100.ch06.ex1;

public class Score4 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    
    Score4(String name, int kor, int eng, int math){
        System.out.println("Score4() 호출됨!");
        this.name = "홍길동";
        this.kor = 100;
        this.eng = 100;
        this.math = 100;
        this.compute();
    }
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }


}
