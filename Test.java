package pushpak58java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.stream.Collectors;


//method and constructor reference
public class Test {
    //static method method reference
    public static <T>void print(T s){
        System.out.println(s);
    }

    public void print1(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        //method reference
        List<String> student = Arrays.asList("pushpak","kunal","soma");

        student.forEach(Test:: print);

        Test s =new Test();
        student.forEach(s::print1);

        //constuctor reference
        List<String>names  =Arrays.asList("Alice","Bob","charli");
        List<Student> collect = names.stream()
                .map(name -> new Student(name))
                .collect(Collectors.toList());



    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
