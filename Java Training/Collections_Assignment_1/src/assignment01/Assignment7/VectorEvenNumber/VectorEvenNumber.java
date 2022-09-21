package assignment01.Assignment7.VectorEvenNumber;

import java.util.*;
public class VectorEvenNumber {
    static Vector<Integer> A1 = new Vector<>();
    static Vector<Integer> A2 = new Vector<>();

    public static Vector<Integer> saveEvenNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                A1.add(i);
        }
        return A1;
    }

    public static Vector<Integer> printEvenNumbers() {
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
