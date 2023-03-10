package programmers.level2;

public class 이진_변환_반복하기 {
    public static void main(String[] args) {
        이진_변환_반복하기 T = new 이진_변환_반복하기();
        int[] solution = T.solution("1111111");
        for (int i : solution) {
            System.out.println(i);
        }
    }

    // 변환 횟수와, 제거된 0의 갯수
    public int[] solution(String s) {
        int convertCount = 0;
        int removeZeroCount = 0;
        while (!"1".equals(s)) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    removeZeroCount++;
                }
            }
            s = s.replaceAll("0", "");
            s = Long.toBinaryString(s.length());
            convertCount++;
        }
        return new int[]{convertCount, removeZeroCount};
    }
}
