public class DoWhile01 {
    public static void main(String[] args) {
        // 输出10句，你好，韩顺平
        int i = 0;
        do {
            System.out.println("你好，韩顺平");
            i++;
        } while (i <= 10);

        System.out.println("退出 do while" + i);

        /**
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 你好，韩顺平
         * 退出 do while11
         */
    }
}