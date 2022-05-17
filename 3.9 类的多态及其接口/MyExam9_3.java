
public class MyExam9_3 {
    public static void main(String[] args) {
        Person  p1 = new Person("张强");
        Student s1 = new Student("李晓菡", "xx大学");
        Student s2 = new Student();

        MyExam9_3 my = new MyExam9_3();
        my.talk(p1);
        my.talk(s1);
        my.talk(s2);

        
    }

    public void talk(Person p) {
        System.out.println(p.speak());
    }
}

class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public String speak() {
        return "我的名字是" + name;
    }
}

class Student extends Person {
    String school;
    public Student(String n, String s) {
        super(n);
        school = s;
    }
    public Student() {
        this("xx", "xx学校");
    }

    public String speak() {
        return "我的名字是" + name + ", 我是" + school + "的学生。";
    }
}