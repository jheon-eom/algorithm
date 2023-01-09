package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"});
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        // 맵 안에 참가한 모든 선수들을 저장
        // 값은 중복된 이름을 고려하여 선수마다 1씩 부여
        for (String s : participant) map.put(s, map.getOrDefault(s, 0) + 1);

        // 완주한 선수일 경우 값 -1하여 다시 저장
        for (String s : completion) map.put(s, map.get(s) - 1);

        // 완주를 못 했을 경우 해당 선수(key)의 값이 != 0
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
