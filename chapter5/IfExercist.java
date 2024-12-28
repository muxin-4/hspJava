public class IfExercist {
    public static void main(String[] args) {
        /**
         * 2.编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两个数之和。
         */

        double a1 = 13.00;
        double a2 = 5.00;
        if (a1 > 10.0 && a2 < 20.0) {
            System.out.println(a1 + a2);
        }

        /**
         * 3.定义两个变量int，判断二者的和，是否能被3整除又能被5整除，打印提示信息
         */
        int b1 = 10;
        int b2 = 35;
        int b3 = b1 + b2;
        if (b3 % 3 == 0 && b3 % 5 == 0) {
            System.out.println("b3能被3整除又能被5整除");
        }

        /**
         * 4.判断一个年份是否是闰年，闰年的条件是符合下面两者之一：(1)年份能被4整除，但不能被100整除 （2）能被400整除
         */
        int c1 = 2024;
        if ((c1 % 4 == 0 && c1 % 100 != 0) || c1 % 400 == 0) {
            System.out.println("c1是闰年");
        }
    }
}