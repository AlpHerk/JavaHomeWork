public class MyExam10_4 {

    public static void main(String[] args) {
        String maxString = "studyinjavamylovisjavahowtolearnjavahowtoprogramjavaapplication"; 
        String minString = "java";
    
        int count = getCount(maxString, minString);
    
        System.out.println("Java在长字符串中出现了：" + count + "次");
    }

    public static int getCount(String maxString, String minString) {
        int count = 0;
        int index = 0;
        index = maxString.indexOf(minString);
        while (index != -1) {
            index = maxString.indexOf(minString, index + minString.length());
            count++;
        }
        
        return count;
    } 
}
