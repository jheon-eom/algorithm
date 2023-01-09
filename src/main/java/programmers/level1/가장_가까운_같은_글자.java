package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        solution2("banana");
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        // "banana" [-1, -1, -1, 2, 2, 2]
        // 이중 for문..?
        // 글자의 인덱스부터 두 번째 for문은 --
        for (int i = 1; i < s.length(); i++) {
            int index = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = index;
                    break;
                } else {
                    answer[i] = -1;
                }
                index++;
            }
        }

        for (int i : answer) System.out.println(i);
        return answer;
    }

    public static int[] solution2(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
                map.put(s.charAt(i), i);
            } else {
                int before = map.get(s.charAt(i));
                answer[i] = i - before;
                map.put(s.charAt(i), i);
            }
        }

        return answer;
    }
}
