package bitcamp.java100;

public class Test12_7{        
    public static void main(String[] args){
        float f1;
        f1 = 98765.6789f;
        f1 = 9876543456789l; //double값을 float에 저장할 수 있으나. 다만 값이 짤릴 뿐. 

        System.out.println(f1); //908765436E12 = 9876543600000

        // f1 = 9876543.4567; error
        f1 = 9876543.4567f;
        System.out.println(f1);



    }
}                                                                                                                                                           