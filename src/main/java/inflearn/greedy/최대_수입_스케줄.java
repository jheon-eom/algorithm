package inflearn.greedy;

import java.util.*;

public class 최대_수입_스케줄 {

    public int solution(List<Lecture> arr, int n, int max) {
        int sum = 0;
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int tmp = 0;
        for (int i = max; i >= 1; i--) {
            for (int j = tmp; j < n; j++) {
                if (arr.get(j).date < i) {
                    tmp = j;
                    break;
                }
                PQ.offer(arr.get(j).money);
            }
            if (!PQ.isEmpty()) {
                sum += PQ.poll();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        최대_수입_스케줄 T = new 최대_수입_스케줄();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        List<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if (max < d) {
                max = d;
            }
        }
        int answer = T.solution(arr, n, max);
        System.out.println(answer);
    }

    static class Lecture implements Comparable<Lecture> {
        private int money;
        private int date;

        public Lecture(int money, int date) {
            this.money = money;
            this.date = date;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.date - this.date;
        }
    }
}
