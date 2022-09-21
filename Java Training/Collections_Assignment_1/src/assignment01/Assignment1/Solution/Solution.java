package assignment01.Assignment1.Solution;
import java.util.*;
public class Solution {
    static ArrayList<Integer> A1 = new ArrayList<>();
    static ArrayList<Integer> A2 = new ArrayList<>();

    public static ArrayList<Integer> saveEvenNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                A1.add(i);
        }
        return A1;
    }

    public static ArrayList<Integer> printEvenNumbers() {
        for (int i = 0; i < A1.size() - 1; i++) {
            System.out.print(2 * A1.get(i) + ", ");
            A2.add(2 * A1.get(i));
        }

        System.out.println(2 * A1.get(A1.size() - 1));
        A2.add(2 * A1.get(A1.size() - 1));
        return A2;
    }

    public static int printEvenNumber(int N) {
        if (A1.contains(N)) {
            return N;
        } else {
            return 0;
        }
    }

}
