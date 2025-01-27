public class ForExercist {
    public static void main(String[] args) {
        /**
         * 1.打印1~100之间所有是9的倍数的整数，统计个数及总和
         */
        int count = 0;
        int length = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println("单个数=" + i);
                count = count + i;
                length = length + 1;
            }
        }
        System.out.println("个数=" + length);
        System.out.println("总和=" + count);

        /**
         * 2.完成下面的表达式输出
         * 0 + 5 = 5
         * 1 + 4 = 5
         * 2 + 3 = 5
         * 3 + 2 = 5
         * 4 + 1 = 5
         * 5 + 0 = 5
         */
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(i + "+" + (n - i) + "=" + n);
        }
    }
}