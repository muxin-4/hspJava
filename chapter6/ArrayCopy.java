import java.util.*;

public class ArrayCopy {
    public static void main(String[] args) {
        /**
         * 将int[] arr1 = {10, 20, 30};拷贝到arr2数组，要求数据空间是独立的
         */
        int[] arr1 = {10, 20, 30};

        // 创建一个新的数组arr2，开辟新的数据空间
        // 大小 arr1.length
        int[] arr2 = new int[arr1.length];

        // 遍历arr1，把每个元素拷贝到arr2对应的位置
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // 修改arr2
        arr2[0] = 100;
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}