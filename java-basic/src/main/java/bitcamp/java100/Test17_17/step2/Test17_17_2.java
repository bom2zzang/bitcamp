// ##call by value
//
// 

package bitcamp.java100.Test17_17.step2;

public class Test17_17_2 {

    
    static float area(int width, int height) {
        return(width * height) / 10000f;
    }

    static float pyeong(int width, int height) {
        return(width * height) / 10000f / 3.3f;
    }
    
    public static void main (String[] args) { 
        
        
        //변수선언
        int width = 390; //cm
        int height = 420; //cm2
        
        //넓이구하기
        System.out.println(area(width, height));
        
        //평으로 출력
        System.out.println(pyeong(width, height));
               
   

    }

}


















