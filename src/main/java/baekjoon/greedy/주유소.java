package baekjoon.greedy;

import java.util.Scanner;

public class 주유소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 변수 생성 및 입력
         */
        System.out.println("도시의 수를 입력하세요.");
        int n = sc.nextInt(); // 도시의 수
        System.out.println("도시의 길이를 입력하세요.");
        int[] nodes = new int[n - 1]; // 도시 간 거리
        for (int i = 0; i < (n - 1); i++) {
            nodes[i] = sc.nextInt();
        }
        System.out.println("각 도시의 주유소 비용을 입력하세요.");
        int[] costs = new int[n]; // 각 도시의 주유소 비용
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }

        /**
         * 문제 풀이
         */
        int tempCost = costs[0]; // 임시 비용
        long minCost = 0; // 최소 비용
        for (int i = 0; i < nodes.length; i++) {
            if (costs[i] < tempCost) {
                tempCost = costs[i];
            }
            minCost += (tempCost * nodes[i]);
        }

        System.out.println(minCost);
    }
}
