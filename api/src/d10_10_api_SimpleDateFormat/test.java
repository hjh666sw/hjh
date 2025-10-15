package d10_10_api_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
            String start1="2023年11月11日 0:0:0";
            String end="2023年11月11日 0:10:0";
            String xj="2023年11月11日 0:1:18";
            String xp="2023年11月11日 0:10:23";

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

            Date startDt= sdf.parse(start1);
            Date endDt= sdf.parse(end);
            Date xjDt= sdf.parse(xj);
            Date xpDt= sdf.parse(xp);

            //把对象日期转换成毫秒值进行比较
            long startTime= startDt.getTime();
            long endTime= sdf.parse(end).getTime();
            long xjTime= sdf.parse(xj).getTime();
            long xpTime= sdf.parse(xp).getTime();

            if (xjTime>=startTime&&xjTime<=endTime) {
                System.out.println("小贾秒杀成功");
            }
            else
                System.out.println("shibai");
            if (xpTime>=startTime&&xpTime<=endTime) {
                System.out.println("xiaopichenggong");
            }
            else
                System.out.println("shibai");
    }
}
