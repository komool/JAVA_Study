import java.io.*;

public class Ch2 {
    // 2.1.1
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.print("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.println('\n');
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1);
        }
    }*/

    public static String format4(int targetNum) {
        String strNum = new String(Integer.toString(targetNum));
        StringBuffer resultStr = new StringBuffer();
        for (int i = strNum.length(); i < 4; i++) {
            resultStr.append(' ');
        }
        return (resultStr.append(strNum)).toString();
    }
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.println("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.print('\n');
        for (int i = 0; i < n; i++) {
            System.out.print(format4(i + 1));
        }
    }*/

    // 2.1.3
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.print("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.print('\n');
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(format4(j + 1));
            }
            System.out.print('\n');
        }
    }*/

    // 2.2
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.print("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.print('\n');
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(format4(j + 1));
            }
            System.out.print('\n');
        }
    }*/

    // 2.3
    /*public static void main(String args[]) throws Exception {
        int n, k;
        System.out.print("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.print('\n');
        k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(format4(k++));
            }
            System.out.print('\n');
        }
    }*/

    // 2.4.1
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.print("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.print('\n');
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(format4(j + 1));
            }
            System.out.print('\n');
        }
    }*/

    // 2.4.2
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.print("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.print('\n');
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(format4(j + 1));
            }
            System.out.print('\n');
        }
    }*/

    // 2.4.3
    /*public static void main(String args[]) throws Exception {
        int n;
        System.out.print("숫자 입력 후 엔터 : ");
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(inputNum.readLine());

        System.out.print('\n');
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(format4(j + 1));
            }
            System.out.print('\n');
        }
    }*/
}
