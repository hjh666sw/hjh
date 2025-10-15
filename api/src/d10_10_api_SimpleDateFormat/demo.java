package d10_10_api_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        //格式化日期对此昂，和时间，毫秒值
        SimpleDateFormat sdf=  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(sdf.format(date));


        String rs=sdf.format(date);//日期
        String rs2=sdf.format(time);//时间毫秒值
        System.out.println(rs);
        System.out.println(rs2);


        //掌握SimpleDateFormat解析字符串时间，成为日期对象
        String dateStr="2023-4-3 12:34:22";
        //创建简单日期格式化对象，指定的时间格式必须与被解析的时间格式一致
        SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date d2= sdf2.parse(dateStr);
       System.out.println(d2);
    }

}
