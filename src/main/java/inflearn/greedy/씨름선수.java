package inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 씨름선수 {
    public int solution(List<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body b : arr) {
            if (b.w > max) {
                cnt++;
                max = b.w;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        씨름선수 T = new 씨름선수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }

    static class Body implements Comparable<Body> {
        public int h;
        public int w;

        public Body(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Body o) {
            return o.h - this.h;
        }
    }
}

