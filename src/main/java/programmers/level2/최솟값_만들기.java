package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 최솟값_만들기 {
    public static void main(String[] args) {
        최솟값_만들기 T = new 최솟값_만들기();
        int solution = T.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
        System.out.println(solution);
    }

    public Integer solution(int[] A, int[] B)  {
        PriorityQueue<Integer> aQ = new PriorityQueue<>();
        PriorityQueue<Integer> bQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            aQ.offer(A[i]);
            bQ.offer(B[i]);
        }
        int answer = 0;
        while (!aQ.isEmpty()) {
            answer += aQ.poll() * bQ.poll();
        }
        return answer;
    }
}
