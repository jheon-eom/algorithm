package programmers.level1;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        solution(12345);
    }

    public static int[] solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        int[] intArr = new int[strArr.length];

        int index = 0;
        for (int i = strArr.length - 1; i >= 0; i--) {
            intArr[index] = Integer.parseInt(strArr[i]);
            index++;
        }

        return intArr;
    }
}
