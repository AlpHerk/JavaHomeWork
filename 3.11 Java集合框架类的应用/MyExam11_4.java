import java.util.*;

public class MyExam11_4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();

        // String[] colors = {"♠", "♥", "♣", "♦"};
        String[] colors = {"黑桃", "红桃", "梅花", "方片"};
        String[] number = {"3", "4", "5", "6", "7", "8","9", "10", "J","Q", "K", "A", "2"};

        // 创建牌堆：对每张扑克编号 0~53
        for(int i=0; i<13; i++) {
            for(int j=0; j<4; j++) {
                hm.put(4*i + j, colors[j]+number[i]);
                array.add(4*i + j);
            }
        }
        hm.put(52, "小王");
        hm.put(53, "大王");
        array.add(52);
        array.add(53);
        
        // 洗牌过程：即随机打乱编号 0~53
        Collections.shuffle(array);
        
        // 发牌过程：
        Set<Integer> zhangSan = new TreeSet<>();
        Set<Integer> zhongSi  = new TreeSet<>();
        Set<Integer> zhouWu   = new TreeSet<>();
        Set<Integer> diZhuPai = new TreeSet<>();

        for(int i=0; i<50; i=i+3) {
            zhangSan.add(array.get(i));
            zhongSi.add(array.get(i+1));
            zhouWu.add(array.get(i+2));
        }
        diZhuPai.add(array.get(51));
        diZhuPai.add(array.get(52));
        diZhuPai.add(array.get(53));

        System.out.print("\n张三的牌：");
        for(int i: zhangSan) System.out.print(" " + hm.get(i));
        System.out.print("\n钟四的牌：");
        for(int i: zhongSi)  System.out.print(" " + hm.get(i));
        System.out.print("\n周五的牌：");
        for(int i: zhouWu)   System.out.print(" " + hm.get(i));
        System.out.print("\n地主的牌：");
        for(int i: diZhuPai) System.out.print(" " + hm.get(i));

    }
}
