package programmers.level0;

public class 컨트롤_제트 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
    }

    public static int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i - 1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }

        return answer;
    }
}
