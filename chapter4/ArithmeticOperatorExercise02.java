public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        /**
         * 需求：
         * 1.假如还有59天放假，问：合xx个星期零xx天
         * 2.思路分析
         * (1) 使用int 变量 days 保存天数
         * (2) 一个星期是7天 星期数weeks：days / 7 零xx天leftDays: days % 7
         * (3) 输出
         *
         * 3.写代码
         */

        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println("days= " + days);
        System.out.println("weeks= " + weeks);
        System.out.println("leftDays= " + leftDays);


        /**
         * 1.需求
         * 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100)，请求出华氏温度对应的摄氏温度。
         *
         * 2.思路分析
         * (1) 先定义一个double变量保存华氏温度fahrenheit
         * (2) 根据给出的公式，进行计算即可5/9*(华氏温度-100)
         * 考虑数学公式和java语言的特性
         * (3) 将得到的结果保存到double摄氏温度centigrade
         *
         * 3.写代码
         */
//        double fahrenheit = 234.6;
//        double centigrade = 5 / 9 * (fahrenheit - 100); // 0.0
//        // 在Java中，当两个整数相除时，结果仍然是一个整数，且小数部分会被舍弃。例如，5 / 9的结果是0而不是0.555...。
//        System.out.println("fahrenheit= " + fahrenheit);
//        System.out.println("centigrade= " + centigrade);

        double fahrenheit = 234.6;
        double centigrade = 5.0 / 9 * (fahrenheit - 100); // 0.0
        // 在Java中，当两个整数相除时，结果仍然是一个整数，且小数部分会被舍弃。例如，5 / 9的结果是0而不是0.555...。
        System.out.println("fahrenheit= " + fahrenheit);
        System.out.println("centigrade= " + centigrade);
    }
}