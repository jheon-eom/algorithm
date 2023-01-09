package programmers.level0;

public class 중복된_문자_제거 {
    public static void main(String[] args) {
        System.out.println(solution("hello"));
    }

    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i ++) {
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
