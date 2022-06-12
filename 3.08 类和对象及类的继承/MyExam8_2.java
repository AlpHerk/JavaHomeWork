
public class MyExam8_2 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setStuID("201811010011");
        stu1.setName("王晓雨");
        stu1.setAge(20);
        stu1.output();

        Student stu2 = new Student();
        Student stu3 = new Student("201811010011", "王晓雨", 20);
        stu2.output();
        stu3.output();
    }
}



class Student {

    private String stuID;   //学号 
    private String name;    //姓名 
    private int age;        //年龄 

    public Student(String s, String n, int a) {
        stuID = s;
        name = n;
        age = a;
    }

    public Student() {
        this.stuID = "000000000000";
        this.name  = "无姓名";
        this.age   = 18;
    }

    public void setStuID(String s) {
        stuID = s;
    }
    
    public void setName(String s) { 
        name =s ;
    }
    
    public void setAge(int a) { 
        age = a;
    }
    
    public String getStuID() { 
        return stuID;
    }
    
    public String getName() { 
        return name;
    }
    
    public int getAge() { 
        return age;
    }
    
    public void output() {   //输出学生的信息 
        String s;
        s = "学号：" + getStuID() + "\t姓名" + getName() + "\t年龄" + getAge();
        System.out.println(s);
    }
}
