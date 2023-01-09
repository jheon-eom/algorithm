package programmers.level0;

import java.util.Arrays;

public class 삼각형의_완성조건2 {
    public static void main(String[] args) {
        solution(new int[] {3, 6});
    }

    public static int solution(int[] sides) {
        int answer = 0;

        // 1. 주어진 배열에 가장 긴 변이 있는 경우
        Arrays.sort(sides);
        int longSide = sides[1];
        while (true) {
            // 나머지 두 변의 길이 합이 가장 긴 변보다 작으면
            if ((sides[0] + longSide) <= sides[1]) {
                break;
            }
            answer++;
            longSide--;
        }

        // 2. 주어지지 않는 변이 가장 긴 변인 경우
        int longSide_ = sides[1] + 1;
        while (true) {
            if ((sides[0] + sides[1]) <= longSide_) {
                break;
            }
            answer++;
            longSide_++;
        }

        return answer;
    }
}
