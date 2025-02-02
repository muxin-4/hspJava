
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        // 创建 Scanner 对象，接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入年份
        System.out.print("请输入一个年份: ");
        int year = scanner.nextInt();

        // 判断是否为闰年
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " 是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }

        // 关闭 scanner
        scanner.close();
    }
}
