package bitcamp.java100;

public class Test14_2{        
    public static void main(String[] args){
        class Book{
            String title;
            String author;
            String press;
            int pageSize;
            double price;
            }
        Book b1;    
        b1 = new Book();

        b1.title = "보미";
        b1.author = "이보미";
        b1.press = "ㅎ";
        b1.pageSize = 9000;
        b1.price = 50.0d;

        System.out.printf("%s, %s, %s, %d, %d\n",
                        b1.title, b1.author, b1.press, b1.pageSize, b1.price);

        
       


    }
}                                                                                                                                                           