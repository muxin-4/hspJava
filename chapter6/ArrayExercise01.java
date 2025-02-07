
import java.util.Arrays;

public class ArrayExercise01 {

    public static void main(String[] args) {
        // 1.创建一个char类型的26个元素的数组，分别放置'A'-'Z'。使用for循环访问所有元素并打印出来。提示：char类型数据运算 'A' + 1 -> 'B' ArrayExercise01.java
        char[] array = new char[26];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ('A' + i);
        }
        System.out.println("array=" + Arrays.toString(array));
    }
}
