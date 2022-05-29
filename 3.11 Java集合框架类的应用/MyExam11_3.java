import java.util.*;

public class MyExam11_3 {
    public static void main(String[] args) {
        List<Student> array = new ArrayList<>();
        Student s1 = new Student("王萌", 18);
        Student s2 = new Student("李娜", 20);
        Student s3 = new Student("刘洋", 19);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        for(int x=0; x<array.size(); x++) {
            Student s = array.get(x);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
