import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {
        /**
         * 4.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位数数字立方和等于其本身。例如：153 = 1 * 1 * 1 + 3
         * * 3 * 3 + 5 * 5 * 5
         */

        // 创建 Scanner 对象，接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入一个整数
        System.out.print("请输入一个三位数: ");
        int number = scanner.nextInt();

        // 判断输入是否为三位数
        if (number < 100 || number > 999) {
            System.out.println("请输入一个三位数！");
            return;
        }

        // 提取数字的个位、十位和百位
        int ones = number % 10; // 个位
        int tens = (number / 10) % 10; // 十位
        int hundreds = number / 100; // 百位

        // 计算各个位数的立方和
        int sumOfCubes = (ones * ones * ones) + (tens * tens * tens) + (hundreds * hundreds * hundreds);

        // 判断是否为水仙花数
        if (sumOfCubes == number) {
            System.out.println(number + " 是水仙花数");
        } else {
            System.out.println(number + " 不是水仙花数");
        }

        // 关闭 scanner
        scanner.close();
    }
}
