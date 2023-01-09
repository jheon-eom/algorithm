package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열_자르기 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] arr = solution2(a, 1, 3);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = num1; i <= num2 ; i++) {
            arrayList.add(numbers[i]);
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
