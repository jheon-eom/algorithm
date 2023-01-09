package programmers.level0;

public class 캐릭터의_좌표 {
    public static void main(String[] args) {
        solution(new String[] {"down", "down", "down", "down", "down"}, new int[] {7, 9});
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] now = {0, 0};

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                now[0] -= now[0] > -(board[0] / 2) ? 1 : 0;
            } else if (keyinput[i].equals("right")) {
                now[0] += now[0] < (board[0] / 2) ? 1 : 0;
            } else if (keyinput[i].equals("up")) {
                now[1] += now[1] < (board[1] / 2) ? 1 : 0;
            } else if (keyinput[i].equals("down")) {
                now[1] -= now[1] > -(board[1] / 2) ? 1 : 0;
            }
        }

        return now;
    }
}
