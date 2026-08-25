import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Student{
    private String name;
    private int age;


public Student(){

}

public Student(String name){
    this.name = name;
}

public void setName(String name){
    this.name = name;
}

public void setAge(int age){
    this.age = age;
}

public String getname(){
    return name;
}

public int getAge(){
    return age;
}

@Override
public String toString(){
    return "Student [name = " + name + ", age = " + age +"]";
}
}


public class MethodRefEx {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Harsh", "Abhinava", "Harshita", "Kumar");
        List<Student> students = new ArrayList<>();
        // List<String> name = names.stream()
        //                 .map(String :: toUpperCase)
        //                 .toList();

        // System.out.println(names);

        // students = names.stream()
        //                 .map(name -> new Student(name))
        //                 .toList();

        students = names.stream()
                        .map(Student :: new)
                        .toList();

       System.out.println(students);

    }
}
