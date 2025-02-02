
public class HomeWork8 {

    public static void main(String[] args) {
        // 8.求出1-1/2 + 1/3 - 1/4 ... 1/100的和

        double sum = 0.0; // 用于存储结果

        // 遍历 1 到 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                // 偶数项减去
                sum -= 1.0 / i;
            } else {
                // 奇数项加上
                sum += 1.0 / i;
            }
        }

        // 输出结果
        System.out.println("1 - 1/2 + 1/3 - 1/4 + ... + 1/100 的和为: " + sum);

    }

}
