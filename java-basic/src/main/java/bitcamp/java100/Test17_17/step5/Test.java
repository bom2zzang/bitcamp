// ##call by value
//
// 

package bitcamp.java100.Test17_17.step5;

public class Test { 
    
    
    public static void main (String[] args) { 
       
        Rect rect;
        rect = new Rect();
        
        rect.width = 390;
        rect.height = 420;
        
        //넓이구하기
        System.out.println(Rect.area(rect));
        
        //평으로 출력
        System.out.println(Rect.pyeong(rect));
               
        
       
    }
}

        
        
       
        






















