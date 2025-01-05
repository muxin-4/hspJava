import java.util.Scanner;

public class NestedIf2 {
    public static void main(String[] args) {
        /**
         应用案例
         出票系统：根据淡旺季的月份和年龄，打印票价

         4月-10月 旺季：
         - 成人(18-60)：60
         - 儿童(<18)：半价
         - 老人(>60)：1/3

         淡季
         - 成人：40
         - 其他：20
         *
         * 技术设计：
         *
         * 1.创建scanner对象，接收用户输入
         * 2.接收成绩保存到double score
         * 3.使用if-else判断如果初赛成绩大于0.8进入决赛，否则提示淘汰
         * 4.进入决赛后，接收char gender，使用if-else输出信息
         */
        // 1.接收输入的成绩，应该定义一个Scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner.nextInt();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        
        if (month >= 4 && month <= 10) {
            System.out.println("旺季");
            if (age >= 18 && age <= 60) {
                System.out.println("60元");
            } else if (age < 18) {
                System.out.println("30元");
            } else {
                System.out.println("20元");
            }
        } else {
            System.out.println("淡季");
            if (age >= 18 && age <= 60) {
                System.out.println("40元");
            }else {
                System.out.println("20元");
            }
        }
    }
}