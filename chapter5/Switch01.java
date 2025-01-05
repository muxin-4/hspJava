import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /**
         * 案例：Switch01.java
         * 1.请编写一个程序，该程序可以接收一个字符，比如：a,b,c,d,e,f,g
         * 2.a表示星期一，b表示星期二
         * 3.根据用户的输入显示的信息，要求使用switch语句完成
         *
         * 思路分析
         * 1.接收一个字符，创建Scanner对象
         * 2.使用switch来完成匹配，并输出对应信息
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符 ");
        char day = myScanner.next().charAt(0);
        switch (day) {
            case 'a':
                System.out.println("今天星期一，猴子吃饭");
                break;
            case 'b':
                System.out.println("今天星期二，猴子喝水");
                break;
            case 'c':
                System.out.println("今天星期三，猴子睡觉");
                break;
            case 'd':
                System.out.println("今天星期四，猴子上厕所");
                break;
            case 'e':
                System.out.println("今天星期五，猴子逛街");
                break;
            case 'f':
                System.out.println("今天星期六，猴子打游戏");
                break;
            case 'g':
                System.out.println("今天星期日，猴子上班");
                break;
            default:
                System.out.println("输入的字符不正确，匹配不到");
        }
        System.out.println("继续执行程序");
    }
}