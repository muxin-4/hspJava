/**
 * 八皇后问题：递归回溯
 * 一维数组 arr[8]，arr[i] = val 表示第 i+1 个皇后放在第 i+1 行第 val+1 列
 */
public class Queen8 {

    private static final int MAX = 8;
    private final int[] arr = new int[MAX];
    private int count;

    public static void main(String[] args) {
        Queen8 q = new Queen8();
        q.place(0);
        System.out.println("共有 " + q.count + " 种解法");
    }

    /**
     * 放置第 n 个皇后（0 表示第一个）
     */
    private void place(int n) {
        if (n == MAX) {
            print();
            count++;
            return;
        }
        for (int col = 0; col < MAX; col++) {
            arr[n] = col;
            if (isOk(n)) {
                place(n + 1);
            }
        }
    }

    /**
     * 判断第 n 个皇后与前面 0..n-1 个是否冲突（同列或同斜线）
     */
    private boolean isOk(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
