package programmers.level1;

import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {
        solution(13, new int[] {1, 2, 5, 6, 10, 12, 13}, new int[] {2, 3, 4, 5, 7, 8, 9, 10, 11, 12});
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        // 수업을 들을 수 있는 학생 수
        // 전체 학생 수 - 도난당하지 않은 학생 수
        int possibleMemberCount = n - lost.length;
        int borrowMemberCount = 0; // 체육복을 빌린 학생 수

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 도난당했지만, 여벌의 체육복이 있는 학생
        // 도난당한 학생 배열과 여벌이 있는 학생 배열에서 삭제 (-1)
        // possibleMemberCount 증가시켜줘야 함
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    possibleMemberCount++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] != -1 && reserve[j] != -1) {
                    if ((reserve[j] - 1) == lost[i] || (reserve[j] + 1) == lost[i]) {
                        borrowMemberCount++;
                        lost[i] = -1;
                        reserve[j] = -1;
                    }
                }
            }
        }

        System.out.println(possibleMemberCount + borrowMemberCount);
        return possibleMemberCount + borrowMemberCount;
    }
}
