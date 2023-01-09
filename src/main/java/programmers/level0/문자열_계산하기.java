package programmers.level0;

import java.util.Arrays;

public class 문자열_계산하기 {
    public static void main(String[] args) {
        String myString = "1 + 2 + 3 - 4";
        myString = myString.replaceAll("- ", "-");
        System.out.println(myString);
        myString = myString.replaceAll("[+] ", "");
        System.out.println(myString);
        myString = myString.trim();
        System.out.println(myString);

//        Arrays.stream(myString.replaceAll("- ", "-");
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] numbersAndPlusMinus = my_string.split(" ");
        answer = Integer.parseInt(numbersAndPlusMinus[0]);

        for (int i = 1; i < numbersAndPlusMinus.length; i++) {
            if (i % 2 != 0) { // i가 짝수일 경우 +, - 기호
                if (numbersAndPlusMinus[i].equals("+")) {
                    answer += Integer.parseInt(numbersAndPlusMinus[i + 1]);
                } else {
                    answer -= Integer.parseInt(numbersAndPlusMinus[i + 1]);
                }
            }
        }

        return answer;
    }
}
