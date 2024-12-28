import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        /**
         * 请输入保国同志的芝麻信用分：
         * 如果：
         * 1.信用分为100分时，输出信用极好
         * 2.信用分为(80,99)时，输出信用优秀
         * 3.信用分为[60,80]时，输出信用一般
         * 4.其它情况，输出信用不及格
         * 5.请从键盘输入保国的芝麻信用分，并加以判断
         */
        // 1.接收输入的年龄，应该定义一个Scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入芝麻信用分(1-100)");
        // 2.把保国同志的芝麻信用分保存到一个变量 int score
        int score = myScanner.nextInt();
        // 3.使用if-else判断，输出对应信息

        // 先对输入的信用分，进行一个范围的有效判断 1-100，否则提示输入错误
        if(score >= 1 && score <= 100) {
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score >= 80 && score <= 99) {
                System.out.println("信用优秀");
            } else if (score >= 60 && score <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        }else {
            System.out.println("输入错误");
        }

        System.out.println("程序继续...");
    }
}