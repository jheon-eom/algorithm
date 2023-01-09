package programmers.level0;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
    }

    public static int solution(int n) {
        int factorial = 1;
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            if (factorial >= n) {
                answer = i - 1;
                return answer;
            } else {
                factorial *= i;
            }
        }
        return 1;
        /*while (true) {
            if (factorial <= n) {
                factorial *= num + 1;
                num++;
            } else {
                break;
            }
        }
        return num - 1;*/
    }
}
