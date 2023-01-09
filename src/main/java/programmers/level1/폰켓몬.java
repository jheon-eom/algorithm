package programmers.level1;

import static java.util.Arrays.stream;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,3,3,2,2,2}));
    }

    public static int solution(int[] nums) {
        int pick = nums.length / 2; // 고를 수 있는 포켓몬 수
        int pkms = stream(nums).distinct().toArray().length;

        return pkms > pick ? pick : pkms;
    }
}
