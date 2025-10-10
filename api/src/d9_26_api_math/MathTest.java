package d9_26_api_math;

public class MathTest {
    public static void main(String[] args) {
        //返回绝对值
        System.out.println(Math.abs(-3.23));
        System.out.println(Math.abs(3.23));

        System.out.println("-------------------");
        //向上取整
        System.out.println(Math.ceil(3.000000001));
        System.out.println(Math.ceil(4.0));

        System.out.println("-------------------");

        //向下取整
        System.out.println(Math.floor(4.0));
        System.out.println(Math.floor(5.00001));
        System.out.println("-------------------");

        //最大值，最小值
        System.out.println(Math.max(534, 232));
        System.out.println(Math.min(534, 232));
        System.out.println("-------------------");

        //次方
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2.5, 3));
        System.out.println("-------------------");

        //随机数，0.0——1.0包前不保后
        System.out.println(Math.random());

    }
}
