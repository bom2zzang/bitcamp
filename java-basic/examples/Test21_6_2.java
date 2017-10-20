

package bitcamp.java100.test21;

import java.io.Console;

public class Test21_6_2 {

 public static void main(String[] args) {
     class Number{
         int v = 10;
         int[] arr = new int[10];
     }
     
     Console console = System.console();
     Number n = new Number();
     
     n.v = Integer.parseInt(console.readLine("숫자?"));
     
     for(int i = 0; n.v > 0; n.v /=10) {
         n.arr[n.v%10]++;
     }
     for(int j = 1; j < 10; j++)
         System.out.printf("%d : %d개",j,n.arr[j]);

 }
}











