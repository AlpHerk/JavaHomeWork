//竞赛评分测试用类
public class MyExam6_3 {
    public static void main(String[]args){
    //用直接赋值方法创建成绩数组
    float[] datas = {94.5f, 88f, 90f, 86.5f, 83.0f, 93.5f, 85, 92};
    System.out.println("各评委评分如下:");
    //输出各评委评分
    for (int i =0; i< datas.length; i++)
        System.out.print(datas[i] +'\t');
    System.out .println();

    //调用Calculator类的findMaxValue方法计算最高分
    float maxValue = Calculator.findMaxValue(datas);
    System.out. println("去掉最高分:" + maxValue);
    float minValue = Calculator.findMinValue(datas); //计算最低分
    System.out.println("去掉最低分:" + minValue);
    float sum = Calculator.calculateSum(datas);     //计算总分
    float average = sum / 6.0f; //计算平均得分
    System.out.println("最后得分:" + average);
    }
    
    //计算器类
    class Calculator {
        //计算数组元素之和
        public static float calculateSum(float[] datas){
        //定义元素和变量
        float sum = 8.0F;
        //利用for循环遍历数组,计算数组元素之和
        for (int i=0; i<datas.length; i++)
            sum += datas[i];
            return sum;
        }
        //求数组元素最大值
        public static float findMaxValue(float[] datas) {
            float max = datas[0];
            for (int i=1;i< datas. length; i++) {
                //最大值max与数组元素逐一比较,如大于max值则替换max的值
                if(-------)
                    max = datas[i];
            }
            return max;
        }
        //求数组元素最小值
        public static float findMinValue(float[] datas){
        float min = datas[0];
        ------
        for (int i= 1; i<datas.length; i++) {
            if (datas[i]<min)
            min = datas[i];
        }
        return min;
    }

}