
public class MyExam9_2 {
    public static void main(String[] args) {
        StaticCat cat1 = new StaticCat("花花", 1);
        StaticCat cat2 = new StaticCat("美亚", 2);

        System.out.println("总共有" + StaticCat.count + "只猫，它们是：");
        System.out.print(cat1.getNumber() + "号， " + cat1.getName());
        StaticCat.say();
        System.out.print(cat2.getNumber() + "号， " + cat2.getName());
        StaticCat.say();
        
    }
}


class StaticCat {
    private String name;
    private int number;
    static int count = 0;
    public StaticCat(String name, int number) {
        this.name   = name;
        this.number = number;
        count  = count++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNumber(int n) {
        number = n;
    }
    public int getNumber() {
        return number;
    }
    public static void say() {
        System.out.println("，它的叫声是喵喵，喵···");
    }

}