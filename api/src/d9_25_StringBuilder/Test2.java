package d9_25_StringBuilder;

public class Test2 {
    public static void main(String[] args) {
        //掌握StringBuilder比String的好处
//        String s = "";
//        for (int i = 0; i < 1000000; i++) {
//            s = s + "abc";
//
//        }
//        System.out.println(s);



        //效率高
    StringBuilder s2 = new StringBuilder();
    for (int i = 0; i < 1000000; i++) {
        s2.append("abc");
    }
    System.out.println(s2);
    }

    //多线程安全StringBuffer


}
