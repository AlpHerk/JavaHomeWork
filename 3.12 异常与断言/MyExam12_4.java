import java.util.*;

public class MyExam12_4 {
    public static void main(String[] args) throws ItemNotAvailableException {
        Repository repos = new Repository();
        repos.deposit("苹果", 99);
        repos.deposit("苹果", 01);
        repos.deposit("香蕉", 99);
        repos.deposit("香蕉", -1);

        Scanner scan = new Scanner(System.in);
        for(int i=0; i<2; i++) {
            System.out.println("请输入<品名，库存>");
            String name = scan.next();
            int amount  = scan.nextInt();
            repos.deposit(name, amount);
        }
        scan.close();

        System.out.println("库存如下：");
        for(Item it : repos.array) {
            System.out.println(it.name + "\t" + it.amount);
        }
    }
}


class Item {
    /** 库存项目 */
    String name;
    int amount;
}

class Repository {
    /** 库存管理 
     * 根据<品名, 入库数量> 调整当期库存信息
     * 入库数量为正表示入库，为负表示出库
     * 不允许入库数量为零，否则抛出非法参数异常
    */
    public List<Item> array = new ArrayList<>();

    // 出库/入库的操作函数
    public void deposit(String name, int amount) throws ItemNotAvailableException {
        boolean flag = false; // 标记所添加项是否在仓库出现
        if(amount == 0) {
            throw new IllegalArgumentException();
        }
        for(Item item : array){
            if(name.equals(item.name)) {
                if(item.amount<Math.abs(amount) && amount<0) {
                    throw new ItemNotAvailableException();
                } else {
                    item.amount += amount;
                }
                flag = true;
            }
        }
        // 若此时仓库中不含添加项
        if(!flag) {
            if(amount > 0) {
                Item item = new Item();
                item.name = name;
                item.amount = amount;
                array.add(item);
            } else {          // 出库不存在的品名抛出错误
                throw new ItemNotAvailableException();
            }
        }
    }
}

class ItemNotAvailableException extends Exception {}