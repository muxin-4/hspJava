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

        /**
         * 2. 实现登录验证，有3次机会，如果用户名为"丁真"，密码"666"提示登录成功，否则提示还有几次机会，请使用for+break完成
         */
//        Scanner myScanner = new Scanner(System.in);
//        myScanner.next
//        for (int j = 1; j <= 3; j++) {
//
//        }
    }
}