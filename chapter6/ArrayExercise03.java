
public class ArrayExercise03 {

    public static void main(String[] args) {
        // 3.请求出一个数组的和和平均值。（养鸡场）
        double[] array = {3, 5, 1, 3.4, 2, 50};

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("数组的和" + sum);
        System.out.println("数组的平均值 " + (sum / array.length));
    }
}
