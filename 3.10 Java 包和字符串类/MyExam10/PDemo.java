package MyExam10;

public class PDemo {
    protected int price = 30;
    protected int num = 5;

    int total() {
        return price * num;
    }

    int getNum() {
        return num;
    }

    void setNum(int num) {
        this.num = num;
    }

    int getTotal() {
        return total();
    }

}
