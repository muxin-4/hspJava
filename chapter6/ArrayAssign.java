import java.util.*;

public class ArrayAssign {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = n1;
        n2 = 80;

        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);

        // 2.数组在默认情况下是引用传递，赋的值是地址,赋值方式是引用赋值。
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 10;

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}