
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        // 2.实现判断一个整数吗，属于哪个范围：大于0；小于0；等于0
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        int number = myScanner.nextInt();
        if (number > 0) {
            System.err.println("大于0");
        }
        if (number < 0) {
            System.err.println("小于0");
        }
        if (number == 0) {
            System.err.println("等于0");
        }
    }
}
