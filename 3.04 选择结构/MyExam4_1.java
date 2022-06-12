public class MyExam4_1 {
    public static void main(String[] args) {
        int grade;
        grade = Integer.parseInt(args[0]);
        switch (grade / 10) {
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
