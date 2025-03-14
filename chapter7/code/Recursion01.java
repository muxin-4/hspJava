public class Recursion01 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.test(4); // 输出什么? n=2 n=3 n=4

        int res = t1.factorial(5);
        System.out.println("res=" + res); // 输出什么 120
    }
}

class T {
    public void test(int n) {
        System.out.println("n1=" + n);
        if (n > 2) {
            test(n - 1);
        } else {
            System.out.println("n2=" + n);
        }
        // System.out.println("n2=" + n);
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            // f(4) * 5 = 24 * 5 = 20
            // f(3) * 4 = 6 * 4 = 24
            // f(2) * 3 = 2 * 3 = 6
            // f(1) * 2 = 1 * 2 = 2
            return factorial(n - 1) * n;
        }
    }

}
