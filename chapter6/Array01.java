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

        double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
        System.out.println("The total weight is " + totalWeight);
        double avgWeight = totalWeight / 6;
        System.out.println("The average weight is: " + avgWeight);
    }
}