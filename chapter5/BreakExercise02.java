import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {
        /**
         * 2. 实现登录验证，有3次机会，如果用户名为"丁真"，密码"666"提示登录成功，否则提示还有几次机会，请使用for+break完成
         *
         * 思路分析
         * 1. 创建Scanner对象接收用户输入
         * 2. 定义String name; String password; 保存用户名和密码
         * 3. 循环3次，如果满足条件就提前退出
         * 4. 定义变量 int change 记录还有几次登录机会
         */

        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String password = "";
        int chance = 3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入你的名字: ");
            name = myScanner.next();
            System.out.println("请输入密码");
            password = myScanner.next();
            // 比较输入的名字和密码是否正确
            // 补充说明字符串的比较使用方法equals
            if ("丁真".equals(name) && "666".equals(password)) {
                System.out.println("恭喜你，登录成功~");
                break;
            }

            // 登录的机会减少一次
            chance = chance - 1;
            System.out.println("你还有" + chance + "次登录机会");
        }
    }
}