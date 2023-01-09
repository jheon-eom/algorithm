package programmers.level0;

public class 가장_큰_수_찾기 {
    public static void main(String[] args) {
        int[] a = {9, 10, 11, 8};
        int[] arr = solution(a);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return new int[] {max, index};
    }
}
