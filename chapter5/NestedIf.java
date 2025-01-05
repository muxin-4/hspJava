import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        /**
         * 参加歌手比赛，如果初赛成绩大于0.8进入决赛，否则提示淘汰。
         * 并且根据性别提示进入男子组或女子组。
         * 输入成绩和性别，进行判断和输出信息。[NestedIf.java]
         *
         * 提示：double score; char gender;
         * 接收字符：char gender = scanner.next().charAt(0);
         *
         * 技术设计：
         * 1.创建scanner对象，接收用户输入
         * 2.接收成绩保存到double score
         * 3.使用if-else判断如果初赛成绩大于0.8进入决赛，否则提示淘汰
         * 4.进入决赛后，接收char gender，使用if-else输出信息
         */
        // 1.接收输入的成绩，应该定义一个Scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入该歌手的成绩");
        double score = myScanner.nextDouble();
        if (score > 8.0) {
            System.out.print("请输入性别");
            char gender = myScanner.next().charAt(0);
            if (gender == '男') {
                System.out.print("进入男子组");
            } else if (gender == '女') {
                System.out.print("进入女子组");
            }else {
                System.out.print("你的性别有误，不能参加决赛");
            }
        } else {
            System.out.print("你被淘汰了");
        }
    }
}