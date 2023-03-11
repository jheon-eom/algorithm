package programmers.level2;

public class 다음_큰_숫자 {

    public static void main(String[] args) {
        다음_큰_숫자 T = new 다음_큰_숫자();
        int solution = T.solution(78);
        System.out.println(solution);
    }

    public int solution(int n) {
        int nextN = n + 1;
        while (true) {
            int nCount = 0;
            int nextNCount = 0;
            String binary = Integer.toBinaryString(n);
            String binaryPlusOne = Integer.toBinaryString(nextN);
            for (char ch : binary.toCharArray()) {
                if (ch == '1') {
                    nCount++;
                }
            }
            for (char ch : binaryPlusOne.toCharArray()) {
                if (ch == '1') {
                    nextNCount++;
                }
            }
            if (nCount == nextNCount) {
                break;
            } else {
                nextN++;
            }
            if (nextN == 1000000) {
                throw new IllegalArgumentException("찾을 수 없습니다.");
            }
        }
        return nextN;
    }
}
