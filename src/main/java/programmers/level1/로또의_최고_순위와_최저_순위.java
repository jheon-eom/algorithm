package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        solution2(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25});
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int lottoCount = 0;
        int lowRank = 0;
        int topRank = 0;

        for (int i = 0; i < win_nums.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == win_nums[i]) lottoCount++;
            }
        }

        if (lottoCount == 6) {
            lowRank = 1;
        } else if (lottoCount == 5) {
            lowRank = 2;
        } else if (lottoCount == 4) {
            lowRank = 3;
        } else if (lottoCount == 3) {
            lowRank = 4;
        } else if (lottoCount == 2) {
            lowRank = 5;
        } else {
            lowRank = 6;
        }

        if (lottoCount + zeroCount == 6) {
            topRank = 1;
        } else if (lottoCount + zeroCount == 5) {
            topRank = 2;
        } else if (lottoCount + zeroCount == 4) {
            topRank = 3;
        } else if (lottoCount + zeroCount == 3) {
            topRank = 4;
        } else if (lottoCount + zeroCount == 2) {
            topRank = 5;
        } else {
            topRank = 6;
        }

        System.out.println("topRank = " + topRank);
        System.out.println("lowRank = " + lowRank);

        answer[0] = topRank;
        answer[1] = lowRank;
        return answer;
    }

    public static int[] solution2(int[] lottos, int[] win_nums) {
        Set<Integer> nums = new HashSet<>();
        int zeroCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            nums.add(lotto);
        }

        int sameCount = 0;
        for (int winNums : win_nums) {
            if (nums.contains(winNums)) sameCount++;
        }

        int highRank = (7 - (sameCount + zeroCount)) > 6 ? 6 : (7 - (sameCount + zeroCount));
        int lowRank = (7 - sameCount) > 6 ? 6 : (7 - sameCount);

        return new int[] {highRank, lowRank};
    }
}
