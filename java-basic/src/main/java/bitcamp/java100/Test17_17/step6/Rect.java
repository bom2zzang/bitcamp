package bitcamp.java100.Test17_17.step6;

public class Rect {

    int width;
    int height;
    
    //인스턴스메서드만들기>static제거, 내장변수this사용

    float area() {
        return(this.width * this.height) / 10000f;
    }

    float pyeong() {
        return(this.width * this.height) / 10000f / 3.3f;
    }
    
}
