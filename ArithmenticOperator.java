import java.util.Scanner;

public class ArithmenticOperator {
    public static void main (String[] args){
        int time;
        int second;
        int minute;
        int hour;
        Scanner sc = new Scanner(System.in);
        System.out.print("【秒转时间计算器】" + "请输入秒数：");//要转换为【小时，分钟，秒】的秒数输入
        time = sc.nextInt();
        second = time % 60;                                   //60余下的秒数
        minute = (time/ 60) %60;                              //60余下的数再求余60余下的分
        hour = (time/60)/60;                                  //60余下的数再求余60余下的小时
        System.out.print(time + "秒是");
        System.out.print(hour+"小时");
        System.out.print(minute+"分钟");
        System.out.print(second+"秒");
    }
}
