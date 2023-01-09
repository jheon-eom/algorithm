package programmers.level1;

public class 크기가_작은_부분_문자열 {
    public static void main(String[] args) {
        solution("10203", "15");
    }

    public static int solution(String t, String p) {
        int answer = 0;
        long parseLongP = Long.parseLong(p);

        for (int i = 0; i <= (t.length() - p.length()); i++) {
            long parseLongT = Long.parseLong(t.substring(i, i + p.length()));
            if (parseLongT <= parseLongP) answer++;
        }

        return answer;
    }
}
