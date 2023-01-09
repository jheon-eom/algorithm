package inflearn.string;

import java.util.Scanner;

public class 단어_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) strArr[i] = sc.next();

        /*for (int i = 0; i < strArr.length; i++) {
            String temp = "";
            for (int j = (strArr[i].length() - 1); j >= 0; j--) {
                temp += strArr[i].charAt(j);
            }
            System.out.println(temp);
        }*/

        for (String s : strArr) {
            String temp = new StringBuilder(s).reverse().toString();
            System.out.println(temp);
        }

    }
}
