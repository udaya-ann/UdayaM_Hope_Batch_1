import java.util.*;

class Student implements Comparable<Student>{
    int rno;
    String name;
    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    public int compareTo(Student s){
        //return this.rno-s.rno; //asc
        return s.rno-this.rno; //desc
    }
}

public class ComparableImple{
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        s.add(new Student(10, "Ann"));
        s.add(new Student(5, "rohan"));
        s.add(new Student(20,"riyas"));
        Collections.sort(s);
        for(Student student:s){
            System.out.println(student.rno+ " "+student.name);
        }
    }
}

