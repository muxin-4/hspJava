import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        /**
         * - 快速入门案例 Array02.java
         *   循环输入5个成绩，保存到double数组，并输出
         *
         *   思路
         *   1.创建一个double数组，大小5
         *   2.循环输入
         *   scores.length 表示数组的大小/长度
         */
        // 使用方式1-动态初始化
        // double[] scores = new double[5];

        // 使用方式2-动态初始化,先声明数组，再new分配空间
        // double[] scores; // 声明数组，这时 scores 是 null
        // scores = new double[5]; // 分配内存空间，可以存放数据

        // 使用方式3-静态初始化
        double[] scores = {2,5,67,8,9};

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素的值");
            scores[i] = scanner.nextDouble();
        }

        // 输出，遍历数组
        System.out.println("==数组的元素/值的情况如下：===");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个元素的值=" + scores[i] );
        }
    }
}