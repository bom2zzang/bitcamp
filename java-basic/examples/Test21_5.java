package bitcamp.java100.test21;

import java.io.Console;

public class Test21_5 {
    // 클래스 변수
    // => 클래스를 실행하기 위해 HDD에서 메모리로 로딩할 때 생성되는 변수이다.
    // => new 명령으로 생성되는 변수가 아니다.

    static class ConsoleCreationException extends RuntimeException{
        
    }
    static class InvalidGugudanException extends RuntimeException{
        
    }
    
    static Console console;
    
    static void prepareInput() {
        console = System.console();
        
        if (console == null) {
            // 예외 상황을 만나면 호출자에게 알린다.
            throw new RuntimeException("콘솔 생성 오류!");
        }
    }
    
    static int promptGugudan() {
        int i = Integer.parseInt(console.readLine("구구단? "));
        
        if (i >= 10 || i == 1 || i < 0) {
            // 예외 상황을 만나면 호출자에게 알린다.
           
            throw new InvalidGugudanException();
        }
        
        return i;
    }
    
    static void printGugudan(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i*j);
        }
    }
    
    public static void main(String[] args) {
        // 메서드를 실행하다가 예외 상황을 보고하면 처리한다.
        try {
            prepareInput();
        } catch (RuntimeException e) {
            System.err.println("콘솔 입력을 지원하지 않습니다.");
            System.exit(1);
        }
        
        while (true) {
            int i = 0;
            try {
                i = promptGugudan();
                if (i == 0) break;
                printGugudan(i);
            } catch (InvalidGugudanException e) {
                System.err.println("구구단의 범위가 아닙니다.");
            }
        }
            
        System.out.println("다시 또 오세요!");
//99단
//    public static void main(String[] args) {
//        
//        
//        class Ggd{
//            int x;
//        }
//        Console console = System.console();
//        Ggd g = new Ggd();
//        
//        g.x = Integer.parseInt(console.readLine("구구단 ?"));
//        
//        if( 1<g.x && g.x<10) {
//            System.out.printf("[%d단]\n",g.x);
//            for(int j = 1; j < 10; j++) {
//                System.out.printf("%d X %d = %d\n",g.x,j,g.x*j);
//            }
//            System.out.println("--------------------");
//        }
//        else if(g.x < 0) System.out.println("안녕");
//        
//        else System.out.println("2~9만가능");
//                
    }
}
