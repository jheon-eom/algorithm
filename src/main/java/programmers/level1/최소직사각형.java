package programmers.level1;

public class 최소직사각형 {
    public static void main(String[] args) {

    }

    public static int solution(int[][] sizes) {
        int max = 0;
        int min = 0;

        for (int[] size : sizes) {
            int paramMax = Math.max(size[0], size[1]);
            int paramMin = Math.min(size[0], size[1]);

            if (paramMax > max) {
                max = paramMax;
            }
            if (paramMin > min) {
                min = paramMin;
            }
        }

        return max * min;
    }
}
