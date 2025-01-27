public class SwitchDetail {
    public static void main(String[] args) {

        // 1.表达式数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的类型，比如输入的是char，而常量是int
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("ok1");
                break;
            case 20:
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
        }
    }
}