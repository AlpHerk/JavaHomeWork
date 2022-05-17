
public class MyExam8_4 {
    public static void main(String[] args) {
        Undergraduate ug = new Undergraduate("2018001", "李明", "xx大学");
        ug.output();
    }
}


class Student { 
    String stuID; 
    String name;
    public Student(String id, String n) { 
        stuID=id;
        name=n; 
    }
}
    

class Undergraduate extends Student {
    String school;
    public Undergraduate(String id, String n, String s) {
        super(id, n);
        this.school = s;
    }
    public void output() {
        System.out.println("学号：" + this.stuID);
        System.out.println("姓名：" + this.name);
        System.out.println("学校：" + this.school);
    }
}
