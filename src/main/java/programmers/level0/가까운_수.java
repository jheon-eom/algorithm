package programmers.level0;

import java.util.Arrays;

public class 가까운_수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 10, 28}, 11));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
}
