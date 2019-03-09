import java.util.Scanner;
public class SeannerExam {
    public static void main (String args[]){
        Scanner a =new Scanner(System.in);
        System.out.println("请按顺序输入年龄，体重，身高");
        //第一次输入的项目 int
        System.out.println("你"+ a.nextInt()+"岁。");
        //第二次输入的项目 double
        System.out.println("你"+a.nextDouble()+ "kg。");
        //第三次输入的项目 double
        System.out.println("你"+a.nextDouble()+"cm。");
    }
}
