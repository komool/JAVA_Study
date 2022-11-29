import java.io.*;

public class Ch1 {
    // 1.1
    /*public static void main(String args[]) {
        System.out.println("자바 공부 시작");
    }*/
    /*public static void main(String args[]) {
        System.out.println("-----------------");
        System.out.println("자바 공부 시작");
        System.out.println("-----------------");
    }*/
    /*public static void main(String args[]) {
        System.out.print('\n');
        System.out.print("-----------------\n");
        System.out.print("자바 공부 시작\n");
        System.out.print("-----------------\n");
    }*/

    // 1.2
    /*public static void main(String args[]) {
        int a, b, c;
        a = 1;
        b = 2;
        c = a + b;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }*/

    // 1.3
    /*public static void main(String args[]) throws Exception {
        int a, b, c;
        System.out.println("a에 들어갈 수 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(inputNum.readLine());

        System.out.println("b에 들어갈 수 입력 후 엔터 : ");
        inputNum = new BufferedReader(new InputStreamReader(System.in));
        b = Integer.parseInt(inputNum.readLine());

        c = a + b;
        System.out.print('\n');
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }*/
    /*BufferedReader
        입력 된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달
            데이터 처리 효율성 높임
        엔터가 입력되기 전까지 입력받은 값을 String으로 받음*/

    // 1.4
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.println("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.println('\n');
        for (int i = 0; i < n; i++) {
            System.out.println("yes ");
            System.out.println("i = " + i + " : print " + n + " many yes");
        }
    }*/
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.println("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.print('\n');
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i + " : 숫자 출력 0 부터 " + (n - 1));
        }
    }*/
}
