public class WhileExercise {
    public static void main(String[] args) {
        /**
         * 1.打印1-100之间所有能被3整除的数[使用while，老师评讲]
         */

        int i  = 1;
        while (i <= 100) {
            if(i % 3 == 0) {
                System.out.println("我可以被3整除:" + i);
            }
            i++;
        }

        /**
         * 2.打印40-200之间所有的偶数[使用while了，课后练习]
         */

        int j = 40;
        while (j <= 200) {
            if(j % 2 == 0) {
                System.out.println("偶数:" + j);
            }
            j++;
        }
    }
}