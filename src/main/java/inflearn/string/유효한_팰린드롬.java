package inflearn.string;

import java.util.Scanner;

public class 유효한_팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();

        if (temp.equals(str)) System.out.println("YES");
        else System.out.println("NO");
    }
}
