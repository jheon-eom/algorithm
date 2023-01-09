package programmers.level0;

public class k의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(10, 50, 5));
    }

    public static int solution(int i, int j, int k) {
        int count = 0;

        for (int num = i; num <= j; num++) {
            int temp = num;
            while (temp != 0) {
                if (temp % 10 == k) {
                    count++;
                }
                temp /= 10;
            }
        }
        return count;
    }
}
