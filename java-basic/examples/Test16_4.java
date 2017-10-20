// ## 반복문
//while 
// 

package bitcamp.java100;

public class Test16_4 {

    public static void main(String[] args) {
     
        int i = 0;
        
        while(i < 5)
            System.out.println(i++);
        

        System.out.println("------------------------");
        
        i = 0;
        while(i < 5) {
            System.out.println("=> ");
            System.out.println(i);
            i++;
              }

        System.out.println("------------------------");
        
        
        
        i = 1;
        while(i <=5) {
            int count = 1;
            while(count <= i) {
            System.out.print("*");
            count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("------------------------");
        
     
        
        //while문의 중첩연습
        //*출력하되 다음과 같이 출력하라
        //    *
        //   **
        //  ***
        // ****
        //*****
        
        i = 1;
        while(i <= 5) {
            int count = 5 - i;
            while(count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while(count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }
        System.out.println("------------------------");
        
        //while문의 중첩연습
        //*출력하되 다음과 같이 출력하라
        //  *
        // ***
        //*****
        i = 1;
        while(i <= 5) {
            
            int count = (5 - i) / 2;
            while(count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while(count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i+=2;
        }
        System.out.println("------------------------");
        
        //while문의 중첩연습
        //*출력하되 다음과 같이 출력하라의 거꾸로
        //  *
        // ***
        //*****
        i = 5;
        while(i >= 1) {
            
            int count = (5 - i) / 2;
            while(count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while(count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i-=2;
        }

        System.out.println("------------------------");
        
        
        //break; 반복문을 멈추고 나가는 명령
        i = 0;
        while (i < 5) {
            if(i == 3) {
                break;
            }
        System.out.println(i);
        i++;
        }//012
            
        System.out.println("------------------------");
        
        
        //continue; 반복문안에서 다음줄을 넘어 조건검사로 이동시키는 명령
        i = 0;
        while (i < 5) {
            if(i == 3) {
                i++;
                continue;
            }
        System.out.println(i);
        i++;
        }//0124
        
        System.out.println("------------------------");
        
        
        //중첩반복문 전체를 빠져나가기
        
        i = 1;
        label1:{
        while (i <= 10) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                if(count == 5) {
                    break label1;//현재반복문탈출
                }
                count++;
            }
            System.out.println();
            i++;
            }
        }
        System.out.println();
        System.out.println("------------------------");
        
        // 구구단 출력 
        // 출력 2 * 1 = 2
        //      2 * 2 = 4  ... 9 * 9 = 81
        
        for(int s = 2; s <= 9; s++) {
            for(int j=1; j <= 9; j++) {
                System.out.println(s + " * " + j + " = " + s * j);
            }
             
            System.out.println();
            System.out.println("------------------------");
        }
        i = 2;
        while (i <= 9) {
            int j = 1;
            while(j <= 9) {
                System.out.printf("%d * %d = %d\n", i, j, (i * j));
                j++;
            }
            i++;
        }
        
        // 주어진 숫자를 뒤에서부터 한개씩 출력하라
        // 9 8 7 6 5 4 3 2 1
        //출력 > 1 2 3 4 5 6 7 8 9
        //반복문과 % 사용

        System.out.println("------------------------");
        
        i = 987654321;
        while(i > 0) {
            System.out.printf(" %d", i%10);
            i /= 10;           
        }
        System.out.println();
        System.out.println("------------------------");
      
        //주어진 숫자에서 각각의 1~9까지 등장하는 숫자 수 세기
        //주어지는 값 4885323
        //출력 - 1 = 0, 2 = 1,
        //배열 사용
        
        i = 4885323;
        int[] ct = new int[10];
        
        while(i > 0) {
            ct[i%10]++;
            i /= 10;
        }
        int x = 0;
        while(x < ct.length) {
            System.out.printf("%d = %d\n", x, ct[x]);
            x++;
        }
        
        
        
        }
        
        

                

        
        
    }



























