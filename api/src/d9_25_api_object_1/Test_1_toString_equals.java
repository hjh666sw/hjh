package d9_25_api_object_1;

public class Test_1_toString_equals {
    public static void main(String[] args) {
        Student_1 s1 = new Student_1("zhangsan", 22);
        System.out.println(s1.toString());
        System.out.println(s1);
        Student_1 s2 = new Student_1("zhangsan", 22);
        System.out.println(s2.equals(s1));
        System.out.println(s2 == s1);
    }
}
