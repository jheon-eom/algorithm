package inflearn.hashmaptreeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String answer = YES;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char ch : s2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                answer = NO;
                break;
            }

            map.put(ch, map.get(ch) - 1);
        }

        System.out.println(answer);
    }

}
