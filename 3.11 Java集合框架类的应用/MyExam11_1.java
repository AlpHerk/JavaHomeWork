
import java.util.*;

public class MyExam11_1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        map.put("1", "机械学院");
        map.put("2", "土木学院");
        map.put("3", "机电学院");
        map.put("4", "经管学院");
        map.put("5", "医学学院");

        System.out.println("请输入查询第几名：");
        String info = scanner.nextLine();
        
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();

            if (key.equals(info)) {
                String value = entry.getValue().toString();
                System.out.println("第" + key + "名：是" + value);
            }

        }
        scanner.close();
    }

}