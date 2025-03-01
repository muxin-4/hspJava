
public class MethodParameter01 {

    public static void main(String[] args) {

        AA aa = new AA();
        int a = 10;
        int b = 20;
        aa.swap(a, b);
        System.out.println("main方法a=" + a + "\tb=" + b);
    }
}

class AA {

    public void swap(int a, int b) {
        System.out.println("交换前a=" + a + "\tb=" + b);
        // 交换a和b的值
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("交换后a=" + a + "\tb=" + b);
    }
}
