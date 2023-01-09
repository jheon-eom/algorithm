package programmers.level0;

import java.util.Arrays;
import java.util.Collections;

public class 최댓값_만들기1 {
    public static void main(String[] args) {
        int[] a = {0, 31, 24, 10, 1, 9};
        System.out.println(solution(a));
    }

    public static int solution(int[] numbers) {
        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[0] * arr[1];
    }
}
