package inflearn.string;

import java.util.Scanner;

public class 문장_속_단어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "";
        String[] strArr = str.split(" ");

        for (String s : strArr)  {
            if (s.length() > answer.length()) answer = s;
        }

        System.out.println(answer);
    }
}
