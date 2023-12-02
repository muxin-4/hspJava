/**
 * 演示转义字符的使用
 * \t：制表符,用于插入一个水平制表符。
 * \r：回车符,用于将光标移到当前行的开头。
 * \n：换行符,用于将光标移动到下一行。
 * \\：一个反斜杠,用于插入反斜杠字符。
 * \"：一个"双引号,用于插入双引号字符。
 * \'：一个'单引号,用于插入单引号字符。
 */
public class ChangeChar {

    // 编写一个main方法
    public static void main(String[] args) {
        /**
         * 输出：
         * 北京天津上海
         */
        System.out.println("北京天津上海");
        /**
         * 输出：
         * 北京平教育
         * 
         * 解读：
         * 1.先输出，韩顺平教育
         * 2.\r表示回车,在文本处理中，\r 被用于表示光标移到当前行的开头，
         * 从而可以在当前行上进行新的输出，覆盖之前的内容。这主要用于模拟打字机的行为，其中回车键会将打印头移回左边的起始位置。
         * 3.从韩开始替换
         * 4.替换后为，北京平教育
         */
        System.out.println("韩顺平教育\r北京");
        /**
         * \n
         * 输出：
         * jack
         * simth
         * mary
         */
        System.out.println("jack\nsimth\nmary");
        /**
         * 输出：
         * 韩顺平教育
         * 北京
         */
        System.out.println("韩顺平教育\r\n北京");
        /**
         * \t
         * 输出：
         * 北京    天津    上海
         */
        System.out.println("北京\t天津\t上海");
        /**
         * 输出：
         * C:\Window\System32\cmd.exe
         */
        System.out.println("C:\\Window\\System32\\cmd.exe");
        /**
         * 输出：
         * 老韩说"要好好学习java，有前途"
         */
        System.out.println("老韩说\"要好好学习java，有前途\"");
        /**
         * 输出：
         * 老韩说'要好好学习java，有前途'
         */
        System.out.println("老韩说\'要好好学习java，有前途\'");
      
    }
}