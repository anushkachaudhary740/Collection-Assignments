package assignment01.Assignment1.Main;

import assignment01.Assignment1.Solution.Solution;

public class Main {
    public static void main(String args[]) {
    Solution assign = new Solution();
        assign.saveEvenNumbers(11);
        assign.printEvenNumbers();
        int contains = assign.printEvenNumber(3);

        System.out.println(contains);

    }
}
