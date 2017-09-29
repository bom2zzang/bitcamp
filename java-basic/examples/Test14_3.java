package bitcamp.java100;

public class Test14_3{        
    public static void main(String[] args){

        //bitcamp수강생정보
        class Student{
            String name;
            String adress;
            int age;
            int studentNumber;
            }
        Student s1;    
        s1 = new Student();

        s1.name = "이보미";
        s1.adress = "동작구 상도동";
        s1.age = 28;
        s1.studentNumber = 166;


        System.out.printf("%s %s %d %d %b\n",
                    s1.name, s1.adress, s1.age, s1.studentNumber);

        
       


    }
}                                                                                                                                                           