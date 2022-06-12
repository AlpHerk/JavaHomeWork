
public class MyExam9_4 {
    public static void main(String[] args) { 
        Dog dog=new Dog();
        Person p = new Person(); dog.speak();
        p.speak(); 
        p.think(); 
    }
}

interface Animal{
    void speak(); 
}
    
interface SeniorAnimal{ 
    void think();
}
    
class Dog implements Animal{ 
    public void speak()  {
        System.out.println("汪汪，汪·····"); 
    }
}
    
//如下代码定义Person类，并实现Animal和SeniorAnimal接口 ---
 class Person implements  Animal, SeniorAnimal {
    public void speak() {
        System.out.println("我可以说一句完整的话。");
    }
    public void think() {
        System.out.println("我会思考问题")
        ;
    }
}
    
