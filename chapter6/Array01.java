// 引出数组
public class Array01 {
    public static void main(String[] args) {
        /**
         *  一个养鸡场有6只鸡，它们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg。请问这6只鸡的总体重是多少？平均体重是多少？请你编一个程序。Array01.java
         *
         *  思路：
         *  1.定义6个变量double，求和得到总体重
         *  2.平均体重 = 总体重 / 6
         *  3.分析传统实现的方式问题，现在是6个，如果是600不用做别的了，定义600个变量就得好久
         *  4.引出新的技术 -> 使用数组来解决
         */
        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;

        System.out.println("使用传统方式解决");
        double totalWeight1 = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
        System.out.println("The total weight is " + totalWeight1);
        double avgWeight1 = totalWeight1 / 6;
        System.out.println("The average weight is: " + avgWeight1);

        // 比如我们用数组来解决上一个问题。
        // 定义一个数组
        // 老韩解读
        // 1.double[] 表示是double类型的数组，数组名hens
        // 2.{3, 5, 1, 3.4, 2, 50} 表示数组的值/元素
        double[] hens = {3, 5, 1, 3.4, 2, 50};

        // 遍历数组得到数组的所有元素的和，使用for循环
        // 老韩解读
        // 1.我们可以通过hens[下标]来访问数组的元素
        // 下标是从 0 开始编号的，比如第1个元素就是 hens[0]，第2个元素hens[1]，依次类推
        // 2.通过for就可以循环的访问数组的值/元素
        // 3.使用一个变量totalWeight将各个元素累积
        System.out.println("使用数组解决");
        double totalWeight2 = 0;
        for (int i = 0; i < hens.length; i++) {
            System.out.println("第" + (i + 1) + "个元素的值=" + hens[i]);
            totalWeight2 += hens[i];
        }

        System.out.println("The total weight is " + totalWeight2);
        System.out.println("The average weight is: " + (totalWeight2 / hens.length));
    }
}