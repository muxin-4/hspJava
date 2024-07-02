public class Method02 {
    public static void main(String[] args) {
        // 请遍历一个数组，输出数组的各个元素值
        int[][] map = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 解决思路1，传统的方法，就是使用单个for循环
        // 遍历map数组
        // 传统的解决方式就是直接遍历
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 解决思路2，定义一个类 MyTools，然后写一个成员方法，调用方法实现
        MyTools myTools = new MyTools();
        myTools.printArr(map);
    }
}

// 把输出的功能，写到一个类的方法中，然后调用该方法即可
class MyTools {
    // 方法，接收一个二维数组
    public void printArr(int[][] map) {
        // 对传入的map数组进行遍历输出
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}