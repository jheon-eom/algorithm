package programmers.level2;

public class 피보나치_수 {

    public static void main(String[] args) {
        피보나치_수 T = new 피보나치_수();
        T.solution(2);
    }

    public int solution(int n) {
        final int divide = 1234567;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % divide;
        }
        return arr[n];
    }
}
