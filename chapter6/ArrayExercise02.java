public class ArrayExercise02 {

    public static void main(String[] args) {
        // 2.请求出一个数组int[]的最大值{4, -1, 9, 10, 23}，并得到对应的下标。ArrayExercise02.java
        int[] array = {4, -1, 9, 10, 23};
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("max=" + max);
        System.out.println("index=" + index);
    }
}
