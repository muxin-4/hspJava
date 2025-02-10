import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        /**
         * 要求：把数组的元素内容反转。ArrayReverse.java
         * arr {11,22,33,44,55,66} -> {66,55,44,33,22,11}
         *
         * // 思考 2min
         * 1.方式1：通过找规律反转【思路分析】
         * 2.方式2：使用逆序赋值方式【思路分析，学员自己完成】
         */

        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }

        System.out.println("arr1=" + Arrays.toString(arr));
    }
}