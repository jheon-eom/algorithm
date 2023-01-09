package programmers.level1;

public class 소수_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int answer = 0;
        int[] filter = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            filter[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            if (filter[i] == 0) continue;
            for (int j = i + i; j <= n; j += i) {
                filter[j] = 0;
            }
        }

        for (int i = 2; i < filter.length; i++) {
            if (filter[i] != 0) answer++;
        }

        return answer;
    }
}
