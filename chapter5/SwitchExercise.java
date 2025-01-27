import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        /**
         * 1.使用switch把小写类型的char型转为大写（键盘输入）。只转换a,b,c,d,e。其它的输出"你的输入有误~"
         */
//        // 创建 Scanner 对象来接收用户输入
//        Scanner myScanner1 = new Scanner(System.in);
//
//        // 提示用户输入一个小写字母
//        System.out.println("请输入a-e：");
//
//        // 读取用户输入的字符
//        char input = myScanner1.next().charAt(0);
//
//        // 使用 switch 语句判断并转换小写字母
//        switch (input) {
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("B");
//                break;
//            case 'c':
//                System.out.println("C");
//                break;
//            case 'd':
//                System.out.println("D");
//                break;
//            case 'e':
//                System.out.println("E");
//                break;
//            default:
//                System.out.println("你的输入有误~");
//                break;
//        }

        /**
         * 2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”（注：输入的成绩不能大于100），提示成绩/60
         *
         * 思路分析
         * 1.这道题我们可以使用分支来完成，但是要求使用switch
         * 2.这里我们需要一个转换，编程思路
         * 如果成绩在[60,100],（(int)(成绩/60) = 1
         * 如果成绩在[0,60]，(int)(成绩/60) = 0
         */

//        double score = 88.5;
//        if (score >= 0 && score <= 100) {
//            switch ((int) (score / 60)) {
//                case 0:
//                    System.out.println("不合格");
//                    break;
//                case 1:
//                    System.out.println("合格");
//                    break;
//            }
//        } else {
//            System.out.println("输入的成绩在0-100");
//        }


        /**
         * 3.根据用于指定月份，打印该月份所属的季节。3，4，5春季 6，7，8夏季 9，10，11 秋季  12 1 2 冬季[课堂练习，提示使用穿透]
         *
         */
        // 创建 Scanner 对象来接收用户输入
        Scanner myScanner3 = new Scanner(System.in);

        // 提示用户输入月份
        System.out.println("请输入月份(1-12)");

        // 读取用户输入的字符
        int month = myScanner3.nextInt();

        // 使用 switch 语句判断并转换小写字母
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("你输入的月份不对(1-12)");
                break;
        }
    }
}