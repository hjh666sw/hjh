package d9_26_api_System;

public class SystemTest {
    public static void main(String[] args) {
        //非零为异常终止虚拟机。0;人为
//        System.exit(0);
//        System.out.println("-----------");

        //currentTimeMillis返回从1970年到现在所经过的毫秒值

        long time=System.currentTimeMillis();
        System.out.println(time);

        for(int i=0;i<1000000;i++){
            System.out.println("输出了"+i);
        }

        long time1=System.currentTimeMillis();
        System.out.println(time1-time/1000.0+"s");

    }
}
