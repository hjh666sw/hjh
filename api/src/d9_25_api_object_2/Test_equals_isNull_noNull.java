package d9_25_api_object_2;

import java.util.Objects;

public class Test_equals_isNull_noNull {
    public static void main(String[] args) {
        String s1=null;
        String s2="they";

       // System.out.println(s1.equals(s2));//s1是空的时候报错
        System.out.println(s1 == null);

        System.out.println(Objects.equals(s1, s2));//提前判断s1是否为null，更安全
        System.out.println(s2 == null);

        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));

        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));


    }
}
