package d9_25_integer;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //Integer a1=new Integer(12);过时
        Integer a2=Integer.valueOf(2);
        System.out.println(a2);

        //自动装箱，自动把基本类型的数据转换为对象
        Integer a3=13;
        System.out.println(a3);

        //自动拆箱
        int a4=a3;
        System.out.println(a4);


        //泛型和集合不支持基本数据类型，只支持引用数据类型
        //ArrayList<int> list=new ArrayList<int>();
        ArrayList<Integer> lise = new ArrayList<>();
        lise.add(1);
        lise.add(2);
        System.out.println(lise.toString());

        System.out.println("____________________________________________________");


        //1.把基本类型的数据转换成字符串
        Integer a=23;
        String rs1=Integer.toString(a);
        System.out.println(rs1);
        System.out.println(rs1+1);

        String rs3=a+"";
        System.out.println(rs3+1);

        String rs2=a.toString();
        System.out.println(rs2);

        //2.把字符串转换成对应的基本类型
        String ageStr="24";
        int age=Integer.parseInt(ageStr);
        System.out.println(age+1);

        String scoreStr="99.5";
        double score=Double.parseDouble(scoreStr);
        System.out.println(score+1);

        //3.
        int ageI =Integer.valueOf(ageStr);
        System.out.println(ageI +1);
    }
}
