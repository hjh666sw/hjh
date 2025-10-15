package d10_10_api_BigDecimal;

import java.math.BigDecimal;

public class BigDecimaldemo {
    public static void main(String[] args) {
        double a=0.1;
        double b=0.2;
        double d=0.3;
        double c=a+b;
        System.out.println(c);


        //将小数转换成字符串再得到BigDecimal对象来使用
        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        BigDecimal demo=BigDecimal.valueOf(d);

        BigDecimal c1=a1.add(b1);
        System.out.println(c1);
        BigDecimal d1=a1.subtract(b1);
        System.out.println(d1);
        BigDecimal e1=a1.multiply(b1);
        System.out.println(e1);
        BigDecimal f1=a1.divide(b1,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(f1);

        //把BigDecimal对象转成double类型的数据
        double rs=f1.doubleValue();
        System.out.println(rs);
//
//        BigDecimal g1=a1.divide(demo);
//        System.out.println(g1);
    }
}
