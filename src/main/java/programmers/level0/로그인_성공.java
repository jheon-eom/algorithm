package programmers.level0;

public class 로그인_성공 {
    public static void main(String[] args) {
        String[] loginInformation = new String[] {"rabbit04", "98761"};
        String[][] db = new String[][] {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}, {"programmer01", "1145"}};

        System.out.println(solution(loginInformation, db));
    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                answer = "wrong pw";
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                }
            }
        }

        return answer;
    }
}
