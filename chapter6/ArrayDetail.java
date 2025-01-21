import java.util.Arrays;

public class ArrayDetail {
    public static void main(String[] args) {
        /**
         * ArrayDetail.java:12: 错误: 不兼容的类型: 从double转换到int可能会有损失
         *          int[] arry1 = {1, 2, 3, 60, 1.1, "hello"};
         *                                      ^
         * ArrayDetail.java:12: 错误: 不兼容的类型: String无法转换为int
         *          int[] arry1 = {1, 2, 3, 60, 1.1, "hello"};
         *                                           ^
         * 2 个错误
         */
        // int[] arry1 = {1, 2, 3, 60, 1.1, "hello"};
        // System.out.println(Arrays.toString(arry1));

        double[] arry2 = {1.1, 2.2, 3.3, 60.6, 100}; // int -> double
        System.out.println(Arrays.toString(arry2)); // [1.1, 2.2, 3.3, 60.6, 100.0]


        // 2.数组中的元素可以是任何类型，包括基本类型和引用类型，但是不能混用
        String[] arr3 = {"北京", "jack", "milan"};
        System.out.println(Arrays.toString(arr3));

        /**
         * 3.数组创建后，如果没有赋值，有默认值
         * int 0,short 0,byte 0,long 0,float 0.0,double 0.0,char \u0000,boolean false,String null
         */
        short[] arr4 = new short[3];
        System.out.println(Arrays.toString(arr4)); // 输出 [0, 0, 0]

        char[] arr5 = new char[3];
        System.out.println(Arrays.toString(arr5)); // 输出 [, , ]

        String str = "Hello\u0000World";
        System.out.println(str);  // 输出 "HelloWorld" ，因为 '\u0000' 不会显示

        /**
         * 4、5简单，省略了
         * 4.使用数组的步骤 1.声明数组并开辟空间 2.给数组各个元素赋值 3.使用数组
         * 5.数组的下标是从0开始的
         */

        /**
         * 6.数组下标必须在指定范围内使用，否则报：下标越界异常，比如 int[] arr = new int[5]; 则有效小标为0-4
         * 数组的下标/索引最小是0，最大是数组的长度-1
         */
        int[] arr = new int[5];
        System.out.println(arr[5]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

    }
}