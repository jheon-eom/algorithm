package programmers.level0;

import java.util.ArrayList;

public class 짝수는_싫어요 {
    public static void main(String[] args) {
        for (int i : solution(15)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                arrayList.add(i);
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
