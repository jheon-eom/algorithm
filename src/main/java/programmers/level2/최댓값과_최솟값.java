package programmers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        solution("1 2 3 4");
    }

    public static String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ");
        List<Integer> list = new ArrayList<>();

        while (st.asIterator().hasNext()) {
            list.add(Integer.parseInt((String) st.asIterator().next()));
        }

        list.sort(Integer::compareTo);

        answer += list.get(0) + " " + list.get(list.size() - 1);

        return answer;
    }
}
