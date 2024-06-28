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
    }
}