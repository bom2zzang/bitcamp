// ## 반복문 
//for
// 

package bitcamp.java100;

public class Test16_6 {

    public static void main(String[] args) {
        //for(변수선언 및 초기화; 조건; 증가문) 명령문;
        for(int i = 0; i < 5; i++)
            System.out.println(i);
        
        System.out.println("------------------------");
        
        
        for(int i = 0, j = 0; i < 5; i++, j +=2 )
            System.out.printf("%d, %d\n", i, j);
        
        System.out.println("------------------------");
        
        
        int sum = 0;
        for(int i = 1; i <= 10; i++)
            sum += i;
            System.out.println(sum);


        System.out.println("------------------------");
        
        for(int i = 1; i <= 10; i++) {
            System.out.print("=> ");
            System.out.println(i);
        }

        System.out.println("------------------------");
        for(int i = 0; i < 10; i++) {
            if(i ==5)
                break;
            System.out.println(i);
        }

        System.out.println("------------------------");
        for(int i = 0; i < 10; i++) {
            if(i == 5)
                continue; //증가, 감소문으로 이동한다.
            System.out.println(i);
        }
        
        System.out.println("------------------------");
        
        int i = 0;
        for(; i< 5; i++)
            System.out.println(i); // 012345 뜬다는데 나는 안 뜸 
        
        System.out.println("------------------------");
        
        i = 0;
        for(; i < 5;) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("------------------------");
        
        i = 0;
        for(;;) {
            System.out.println(i);
            i++;
            if(i == 5)
                break;
        }// 그냥 while문을 써라.
        
        System.out.println("------------------------");
        
        String[] names = {"홍", "유", "안", "윤", "임"};
        for(int idx = 0; idx < names.length; idx++) {
            System.out.println(names[idx]);
        }

        System.out.println("------------------------");
    
        for(int a = 1; a <= 5; a++) {
            for(int b = 0; b <= a; b++) {
                System.out.print("*");
            }
     

        System.out.println();  
        }
        System.out.println("------------------------");
         
        label1:{
        for(int a = 1; a <= 5; a++) {
            for(int b = 0; b < a; b++) {
                System.out.print("*");
                if(b == 2)
                    break label1;
                }
            System.out.println();
            }
        }

        System.out.println("------------------------");
        
        //for문만을 이용하여 구구단을 출력하라

        for(int s = 2; s <= 9; s++) {
            for(int j=1; j <= 9; j++) {
                System.out.println(s + " * " + j + " = " + s * j);
               
                
            //주어진 숫자를 거꾸로 하나씩 출력
            //for(변수선언 및 초기화; 조건; 증가문) 명령문;
            // 결과 : 4 3 2 1 6 7 8 9 
            }
             System.out.println("------------------------");
        }
        
        
        for (int v = 98761234 ; v > 0 ;v /= 10) {
            System.out.printf("%d",v%10);
        }
            System.out.println();
            System.out.println("------------------------");
       
        
        
        
//        
//        while(i > 0) {
//            System.out.printf(" %d", i%10);
//            i /= 10;           
//        }
//        System.out.println();
//        System.out.println("------------------------");
        
    
    

    }
}


























