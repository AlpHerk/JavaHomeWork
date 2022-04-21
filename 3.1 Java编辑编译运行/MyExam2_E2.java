public class MyExam2_E2 {
    public static void main(String[] args) {
        boolean leap;
        String original, reverse;
        int num = (int)(Math.random() * 100000);

        original = Integer.toString(num);
        reverse  = reverseStr(original);

        leap = (original.equals(reverse)) ? true : false;
        System.out.println(num + " 是回文数吗？" + leap);
        System.out.println("随机产生一个大写字母 " + randomAlphabet());
    }
    public static char randomAlphabet() {
        int random;
        char alpha;
        random = 'A' + (int)(Math.random() * 26) % 26;
        alpha = (char)random;
        return alpha;
    }
    public static String reverseStr(String str) {
        // String str = Integer.toString(num);
        return new StringBuffer(str).reverse().toString();
    }
}
