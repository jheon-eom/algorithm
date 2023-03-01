package inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 회의실_배정 {

    public int solution(List<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int endTime = 0;
        for (Time t : arr) {
            if (t.start >= endTime) {
                cnt++;
                endTime = t.end;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        회의실_배정 T = new 회의실_배정();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(T.solution(arr, n));
    }

    static class Time implements Comparable<Time> {
        public int start;
        public int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }
}
