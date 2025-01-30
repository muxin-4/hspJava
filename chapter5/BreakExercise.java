public class BreakExercise {
    public static void main(String[] args) {
        /**
         * 1. 1-100以内的数求和，求出当和第一次大于20的当前数 [for + break]
         */
        int sum = 0;
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            if(sum > 20) {
                n = i;
                break;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("n = " + n);


    }
}