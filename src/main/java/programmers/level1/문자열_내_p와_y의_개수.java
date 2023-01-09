package programmers.level1;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        System.out.println(solution("ppY"));
    }

    static boolean solution(String s) {
        String[] strArr = s.toLowerCase().split("");
        int countP = 0;
        int countY = 0;

        for (String str : strArr) {
            if (str.equals("p")) {
                countP++;
            } else if (str.equals("y")) {
                countY++;
            }
        }
        return countP == countY ? true : false;
    }

}
