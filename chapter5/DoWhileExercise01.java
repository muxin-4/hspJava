public class DoWhileExercise01 {
    public static void main(String[] args) {
        /**
         * 1.打印1-100
         */
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);

        /**
         * 2.计算1-100的和
         */
        int j = 1;
        int sum = 0;
        do {
            sum = sum + j;
            j++;
        } while (j <= 100);
        System.out.println(sum);

        /**
         * 3.统计1-200之间能被5整除但不能被3整除的个数
         */
        int k = 1;
        int count = 0;
        do {
            if (k % 5 == 0 && k % 3 != 0) {
                count++;
            }
            k++;
        } while (k <= 200);
        System.out.println(count);
    }
}