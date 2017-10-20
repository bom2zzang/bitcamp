// 
//


package bitcamp.java100.test21;

import java.io.Console;

public class Test21_4 {    public static void main(String[] args) {

    class Number {
        int v =0;
        int[] arr = new int[10];
    }
    /////////////////////////////////////////////////////////
    Console console = System.console();

    if(console == null) {
        System.err.println("콘솔을 지원하지 않습니다.");
        System.exit(1);
    }
    ////////////////////////////////////////////////////////

    Number n = new Number();

    n.v = Integer.parseInt(console.readLine("숫자?  "));

    for(int i = 0; n.v > 0; n.v /= 10) {
        n.arr[n.v % 10]++;
    }

        for(int j = 0; j < 10; j++) {
            System.out.printf("%d : %d개\n",j,n.arr[j]);
        }
    

}
}





















