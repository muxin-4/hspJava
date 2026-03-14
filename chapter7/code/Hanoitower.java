public class Hanoitower {
    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.move(3, 'A', 'B', 'C');
    }
    
}


class Tower {
    // num 表示要移动的盘子数量
    // a, b, c 表示盘子的柱子编号
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        }else {
            // 移动 num - 1 个盘子从 a 到 b，借助 c
            move(num - 1, a, c, b);
            // 移动第 num 个盘子从 a 到 c
            System.out.println(a + "->" + c);
            // 移动 num - 1 个盘子从 b 到 c，借助 a
            move(num - 1, b, a, c);
        }
    }
}