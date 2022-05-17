public class MyExam10_3 {
    public static void main(String[] args) {
        String s = "hello java";
        int k;
        k = (int)(Math.random()*100 + 1);
        System.out.println("原字符串为：" + s);
        Caesar c = new Caesar(s, k);
        System.out.println("密钥是：" + k);

        String str = c.process();
        System.out.println("加密字符串为：" + str);

        Caesar c1 = new Caesar(str, k);
        str = c1.deprocess();
        System.out.println("解密字符串为：" + str);
    }
}


class Caesar {

    String s;
    int key;

    Caesar(String es, int n) {
        this.s = es;
        this.key = n;
    }
    
    public String process() {
        String es = "";
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c>='a' && c<='z') {
                c += key % 26;
                if (c < 'a') {
                    c += 26;
                }
                if (c > 'z') {
                    c -= 26;
                }
            } else if (c>='A' && c<='Z') {
                c += key % 26;
                if (c < 'A') {
                    c += 26;
                }
                if (c > 'Z') {
                    c -= 26;
                }
            }
            es += c;
        }
        return es;
    }


    public String deprocess() {
        String es = "";
        for (int i=0; i<s.length(); i++) {
            char c = (s.toCharArray())[i];
            if (c>='a' && c<='z') {
                c -= key % 26;
                if (c < 'a') {
                    c += 26;
                }
                if (c > 'z') {
                    c -= 26;
                }
            } else if (c>='A' && c<='Z') {
                c -= key % 26;
                if (c < 'A') {
                    c += 26;
                }
                if (c > 'Z') {
                    c -= 26;
                }
            }
            es += c;
        }
        return es; 
    }


}
