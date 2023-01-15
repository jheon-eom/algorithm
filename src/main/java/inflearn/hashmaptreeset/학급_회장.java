package inflearn.hashmaptreeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급_회장 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Map<Character, Integer> map = new HashMap<>();
        for (char key : s.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        char answer = ' ';
        int max = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);
    }

}
