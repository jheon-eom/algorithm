package programmers.level0;

public class 세균_증식 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
    }

    public static int solution(int n, int t) {
        final int proliferate = 2;
        int virus = n;
        for (int i = 1; i <= t; i++) {
            virus = virus * proliferate;
        }
        return virus;
    }
    public static int solution2(int n, int t) {
        int virus = 0;

        virus = n << t;

        return virus;
    }

}
