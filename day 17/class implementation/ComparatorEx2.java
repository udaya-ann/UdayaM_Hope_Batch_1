import java.util.*;


class Student{
    int rno;
    int age;
    double mark;
    Student(int rno, int age,double mark){
        this.rno=rno;
        this.age=age;
        this.mark=mark;
    }
    public String toString(){
        return this.rno+ " "+ this.age+" "+this.mark;
    }
}
// class AgeComparator implements Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return Integer.compare(s1.age,s2.age); //asc
//         return Integer.compare(s2.age,s1.age); //desc
//     }
// }


class MarkComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        //return Double.compare(s1.mark,s2.mark) //asc
        return Double.compare(s2.mark,s1.mark); // desc
    }
}

class RollNumberCom implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.rno,s2.rno); //asc
        //return Integer.compare(s2.rno,s1.rno); //desc
    }
}



public class ComparatorEx2 {
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        s.add(new Student(10,18,91));
        s.add(new Student(5,24,95));
        s.add(new Student(20,20,90));
        //Collections.sort(s,new AgeComparator());
        Collections.sort(s,new MarkComparator());
        Collections.sort(s,new RollNumberCom());
        for(Student stu:s){
            System.out.println(stu);
        }
    }
}
//rollno - asc
//marks - desc