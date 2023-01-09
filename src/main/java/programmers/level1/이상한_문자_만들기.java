package programmers.level1;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                index = 0;
            } else {
                index++;
            }
            if (index % 2 != 0) { //
                answer += String.valueOf(chars[i]).toUpperCase();
            } else {
                answer += String.valueOf(chars[i]).toLowerCase();
            }
        }

        return answer;
    }
}
