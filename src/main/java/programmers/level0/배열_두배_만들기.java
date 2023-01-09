package programmers.level0;

import java.util.ArrayList;

public class 배열_두배_만들기 {
    public static void main(String[] args) {

    }
    public static int[] solution(int[] numbers) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arrList.add(numbers[i] * 2);
        }
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
