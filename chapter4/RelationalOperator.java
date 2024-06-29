public class RelationalOperator {
    public static void main(String[] args) {
        int a = 9; // 提示：开发中，不可以使用a,b a1,bc n1,n2...
        int b = 8;
        System.out.println(a > b); // true
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
        System.out.println(a < b); // false
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        boolean flag = a > b; // true
        System.out.println("flag= " + flag);
    }
}