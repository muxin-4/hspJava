import java.util.Scanner;

public class MulForExercise01 {
    public static void main(String[] args) {
        /**
         * 1.统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]
         */
        Scanner myScanner = new Scanner(System.in);
        int classNum = 3;
        int studentNum = 5;
        int passNum = 0;
        double total = 0;
        for (int i = 1; i <= classNum; i++) {
            double count = 0;
            double avg;
            for (int j = 1; j <= studentNum; j++) {
                System.out.println("输入" + i + "个班的第" + j + "个学生的成绩");
                double score = myScanner.nextDouble();
                System.out.println("成绩为" + score);
                count += score;
                total += score;
                if(score >= 60) {
                    passNum++;
                }
            }
            avg = count / studentNum;
            System.out.println("各个班的平均分" + avg);
        }
        double avgTotal = total / classNum / studentNum;
        System.out.println("所有班级的总分" + total);
        System.out.println("所有班级的平均分" + avgTotal);
        System.out.println("统计3个班及格人数" + passNum);


        /**
         * 3.打印出九九乘法表[课后题]
         */
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + "*" + j + "=" + i * j);
//            }
//        }

    }
}