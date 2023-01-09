package baekjoon.greedy;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        int price = new Scanner(System.in).nextInt();
        int[] changes = {500, 100, 50, 10, 5, 1};
        int count = 0;
        int money = 1000 - price;

        for (int i = 0; i < changes.length; i++) {
            if (money / changes[i] > 0) {
                count += money / changes[i];
                money %= changes[i];
            }
        }

        System.out.println(count);
    }
}
