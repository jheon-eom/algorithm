package inflearn.hashmaptreeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 모든_아나그램_찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.next();
        Map<Character, Integer> sm = new HashMap<>();
        Map<Character, Integer> tm = new HashMap<>();

        for (char x : t.toCharArray()) tm.put(x, tm.getOrDefault(x, 0) + 1);

        int L = t.length() - 1;
        for (int i = 0 ; i < L; i++) sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i),
                sm.getOrDefault(s.charAt(i), 0) + 1));

        int answer = 0;
        int lt = 0;
        for (int rt = L; rt < s.length(); rt++) {
            sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0) + 1);
            if (sm.equals(tm)) answer++;
            sm.put(s.charAt(lt), sm.get(s.charAt(lt)) - 1);
            if (sm.get(s.charAt(lt)) == 0) sm.remove(s.charAt(lt));
        }

        System.out.println(answer);
    }

}
