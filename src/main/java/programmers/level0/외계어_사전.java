package programmers.level0;

public class 외계어_사전 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"p", "o", "s"}, new String[] {"sod", "eocd", "qixm", "adio", "soo"}));
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (String dicS : dic) {
            boolean isRight = true;
            for (String spellS : spell) {
                if (!dicS.contains(spellS)) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
