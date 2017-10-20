// ##call by value
//
// 

package bitcamp.java100;

public class Test17_14 {
    // 메서드를 호출할 때 값을 넘긴다.
    // 호출자의 로컬변수의 값을 변경할 수 없다.
    
    static void swap(int a, int b) {
        int temp = a;
        a = 0;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", a, b);
    }
    static void swap2(int[] r) {
        int temp = r[0];
        r[0] = r[1];
        r[1] = temp;
        System.out.printf("swap(): r[0] = %d, r[1] = %d\n", r[0], r[1]);
        
        
    }
     
    public static void main (String[] args) { //entry point
        int a = 5;
        int b = 7;
        
        //호출할 때 값을 넘기는 예 > call by value
        swap(a, b);
        System.out.printf("main(): a = %d, b = %d\n", a, b);
        

        //호출할 때 주소를 넘기는 예 > call by reference
        int arr[] = new int[2];
        arr[0] = 5;
        arr[1] = 7;
        
        swap2(arr);
        System.out.printf("main(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
        //
        
        
        

    }
}
























