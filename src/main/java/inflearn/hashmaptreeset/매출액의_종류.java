package inflearn.hashmaptreeset;

import java.util.*;

public class 매출액의_종류 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        List<Integer> answer = new ArrayList<>();
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }

        for (int i : answer) System.out.print(i + " ");
    }

}
