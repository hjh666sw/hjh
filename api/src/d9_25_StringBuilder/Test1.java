package d9_25_StringBuilder;

public class Test1 {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("itheima");

        //支持拼接内容
        s1.append(12);
        System.out.println(s1);
        s1.append("黑马");
        s1.append(true);
        System.out.println(s1);

        //支持链式编程
        s1.append(666).append("hema2").append(12);
        System.out.println(s1);

        //反转
        s1.reverse();
        System.out.println(s1);

        //返回长度
        System.out.println(s1.length());

        //把StringBuilder对象转换为String类型
        String s2 = s1.toString();
        System.out.println(s2);


    }
}
