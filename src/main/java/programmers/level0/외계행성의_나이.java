package programmers.level0;

public class 외계행성의_나이 {
    public static void main(String[] args) {

    }

    public static String solution(int age) {
        String answer = "";
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }

        return answer;

    }
}
