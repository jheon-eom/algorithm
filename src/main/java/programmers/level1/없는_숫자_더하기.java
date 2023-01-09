package programmers.level1;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 6, 7, 8, 0}));
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        int[] sum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (sum[i] == numbers[j]) {
                    sum[i] -= numbers[j];
                }
            }
            answer += sum[i];
        }
        return answer;
    }
}
