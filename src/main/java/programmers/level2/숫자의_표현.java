package programmers.level2;

public class 숫자의_표현 {

    public static void main(String[] args) {
        숫자의_표현 T = new 숫자의_표현();
        int solution = T.solution(2);
        System.out.println(solution);
    }

    // 2 point
    public int solution(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        int count = 1;
        int sum = 0;
        int lt = 0;
        int rt = 0;
        int[] arr = new int[(n / 2) + 1];
        for (int i = 0; i < (n / 2) + 1; i++) {
            arr[i] = i + 1;
        }
        for (; rt < arr.length; rt++) {
            sum += arr[rt];
            if (sum == n) {
                count++;
            }
            while (sum >= n) {
                sum -= arr[lt];
                lt++;
                if (sum == n) {
                    count++;
                }
            }
        }
        return count;
    }
}
