// 位运算

public class BitOperator {
    public static void main(String[] args) {

        /**
         * 1.先得到 2 的补码
         * 2 是int，int占4个字节，一个字节8bit
         * 2 的原码 00000000 00000000 00000000 00000010
         * 2 是正数，所以补码和原码一样
         * 2 的补码是 00000000 00000000 00000000 00000010
         * 
         * 2.再得到 3 的补码
         * 3 是int，int占4个字节，一个字节8bit
         * 3 的原码 00000000 00000000 00000000 00000011
         * 3 是正数，所以补码和原码一样
         * 所以 3 的补码是 00000000 00000000 00000000 00000011
         * 
         * 3.按位与&： 两位全为1，结果为1，否则为0
         * 2 的补码：00000000 00000000 00000000 00000010
         * 3 的补码：00000000 00000000 00000000 00000011
         * 按位与&运算后的补码：00000000 00000000 00000000 00000010
         * 
         * 4.查看2&3的结果，要把补码转为原码
         * 按位与&运算后的原码：因为是正数，所以原码和补码相同
         * 所以按位与&运算后的原码是 00000000 00000000 00000000 00000010
         * 
         * 5.原码转为10禁止
         * 原码00000000 00000000 00000000 00000010，转换成10进制，结果是2
         */
        System.out.println(2 & 3); // 2

        /**
         * 1.先得到-2的补码
         * -2 是int，int占4个字节，一个字节8bit
         * -2的原码 10000000 00000000 00000000 00000010
         * -2的反码 11111111 11111111 11111111 11111101
         * -2的补码 11111111 11111111 11111111 11111110
         * 2.对-2的补码按位取反 00000000 00000000 00000000 00000001，结果是1
         */
        System.out.println(~-2); // 1

        /**
         * 1.先得到2的补码
         * 2 是int，int占4个字节，一个字节8bit
         * 2 的原码 00000000 00000000 00000000 00000010
         * 2 是正数，所以补码和原码一样
         * 2 的补码是 00000000 00000000 00000000 00000010
         * 2.按位取反~2 运算后的补码 11111111 11111111 11111111 11111101
         * 3.运算后的反码（补码减一） 11111111 11111111 11111111 11111100
         * 4.运算后的原码 10000000 00000000 00000000 00000011，结果是-3
         */
        System.out.println(~2); // -3
    }
}