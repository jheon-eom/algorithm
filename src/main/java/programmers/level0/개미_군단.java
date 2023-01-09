package programmers.level0;

public class 개미_군단 {
    public static void main(String[] args) {
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
        return (hp / 5) + ((hp % 5) / 3) + (((hp % 5) % 3) / 1);
    }
}
