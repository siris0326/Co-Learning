/*
*  막보기 예제
*  소스 파일 : Hello.java
*
 */



public class Hello2 {                          //类别定义class declaration
                                               //这里Public（access specifier）访问权限修饰词
    public static int sum(int n,int m){        //class里面所属函数称为method
        return n + m; //30리턴
    }
    // main()메소드에서 시행 시작
    public static void main(String[] args){    //单个的class需要单个的main（）
        int i = 20;
        int s;
        char a;

        s = sum(i,10);                   //메소드 호출
        a = '?';
        System.out.println(a);               //문자 '?' 화면 출력           （打印画面）
        System.out.println("Hello2");        //"Hello2"문지열 화면 출력
        System.out.println(s);               //정수 ㄴ 겂 화면 출력
    }

}
