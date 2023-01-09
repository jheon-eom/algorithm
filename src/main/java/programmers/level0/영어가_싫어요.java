package programmers.level0;

public class 영어가_싫어요 {
    public static void main(String[] args) {
        solution("onetwothreefourfivesixseveneightnine");
    }

    public static long solution(String numbers) {
        if (numbers.contains("zero")) {
            numbers = numbers.replaceAll("zero", "0");
        }
        if (numbers.contains("one")) {
            numbers = numbers.replaceAll("one", "1");
        }
        if (numbers.contains("two")) {
            numbers = numbers.replaceAll("two", "2");
        }
        if (numbers.contains("three")) {
            numbers = numbers.replaceAll("three", "3");
        }
        if (numbers.contains("four")) {
            numbers = numbers.replaceAll("four", "4");
        }
        if (numbers.contains("five")) {
            numbers = numbers.replaceAll("five", "5");
        }
        if (numbers.contains("six")) {
            numbers = numbers.replaceAll("six", "6");
        }
        if (numbers.contains("seven")) {
            numbers = numbers.replaceAll("seven", "7");
        }
        if (numbers.contains("eight")) {
            numbers = numbers.replaceAll("eight", "8");
        }
        if (numbers.contains("nine")) {
            numbers = numbers.replaceAll("nine", "9");
        }

        return Long.parseLong(numbers);
    }
}
