package programmers.level0;

public class 치킨_쿠폰 {
    public static void main(String[] args) {

    }

    public static int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) { // 치킨의 수가 10마리 이상일 때까지
            int service = chicken / 10;
            int coupon = chicken % 10;

            chicken = service + coupon;

            answer += service;
        }

        return answer;
    }
}
