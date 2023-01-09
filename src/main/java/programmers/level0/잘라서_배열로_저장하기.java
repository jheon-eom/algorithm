package programmers.level0;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 잘라서_배열로_저장하기 {
    public static void main(String[] args) {
        solution("abc1Addfggg4556b", 6);
    }

    public static String[] solution(String my_str, int n) {
        List<String> strings = new ArrayList<>();

        String temp = "";
        for (int i = 0; i < my_str.length(); i++) {
            temp += my_str.charAt(i);
            if (temp.length() == n || (i + 1) == my_str.length()) {
                strings.add(temp);
                temp = "";
            }
        }

        String[] answer = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            answer[i] = strings.get(i);
        }

        return answer;
    }
}
