/**
 * 演示字符串转基本数据类型的细节
 */
public class StringToBasicDetail {
    public static void main(String[] args) {
        String str = "hello";
        // 转成int
        int n1 = Integer.parseInt(str);
        System.out.println(n1); // Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
    }
}