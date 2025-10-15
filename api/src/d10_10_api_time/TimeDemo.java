package d10_10_api_time;

import java.util.Date;

public class TimeDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

       long time= date.getTime();
       System.out.println(time);

       time+=2*1000;
       Date date2 = new Date(time);
       System.out.println(date2);

       Date d3=new Date();
       d3.setTime(time);
       System.out.println(d3);


    }
}
