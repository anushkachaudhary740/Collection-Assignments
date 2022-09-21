package assignment01.Assignment6.PrinEvenNumber;

import java.util.LinkedList;

public class PrintEvenNumber {
        static LinkedList<Integer> A1 = new LinkedList<>();
        static LinkedList<Integer> A2 = new LinkedList<>();

        public static LinkedList<Integer> saveEvenNumbers(int n) {
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0)
                    A1.add(i);
            }
            return A1;
        }

        public static LinkedList<Integer> printEvenNumbers() {
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
