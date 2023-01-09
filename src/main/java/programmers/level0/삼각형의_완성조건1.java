package programmers.level0;

import java.util.Arrays;

public class 삼각형의_완성조건1 {
    public static void main(String[] args) {
        int[] sides = {199, 72, 222};
        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        if ((sides[0] + sides[1]) > sides[2]) {
            return 1;
        } else {
            return 2;
        }
    }
}
