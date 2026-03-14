public class RecursionExercise01 {
    public static void main(String[] args) {
        // 1.请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的值是多少
        int n = 7;
        System.out.println("斐波那契数是" + fibonacci(n));

         /**
          * 2.猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后
            每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时（即还没吃）
            发现只有1个桃子了。问题：最初共多少个桃子？

            思路分析 逆推
            1. day = 10 时，有1个桃子
            2. day = 9 时，有(day10 + 1) * 2 = 4个桃子
            3. day = 8 时，有(day9 + 1) * 2 = 10个桃子
            4. day = 7 时，有(day8 + 1) * 2 = 22个桃子
            5. day = 6 时，有(day7 + 1) * 2 = 46个桃子
            6. day = 5 时，有(day6 + 1) * 2 = 94个桃子
            7. day = 4 时，有(day5 + 1) * 2 = 190个桃子
            8. day = 3 时，有(day4 + 1) * 2 = 382个桃
            9. day = 2 时，有(day3 + 1) * 2 = 766个桃子
            10. day = 1 时，有(day2 + 1) * 2 = 1534个桃子
          */
        int day = 2;
        int peachNum = peach(day);
        System.out.println("最初有" + peachNum + "个桃子");
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int peach(int day) {
        if (day == 10) {
            return 1;
        }
        return (peach(day + 1) + 1) * 2;
    }
}
