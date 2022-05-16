
public class MyExam8_1 {
    public static void main(String[] args) {
        
    }
}

class Student{

    private String stuID;   //学号 
    private String name;    //姓名 
    private int age;        //年龄 

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
