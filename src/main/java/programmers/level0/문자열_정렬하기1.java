package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_정렬하기1 {
    public static void main(String[] args) {

    }

    public static int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]","");
        return Arrays.stream(my_string.split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
