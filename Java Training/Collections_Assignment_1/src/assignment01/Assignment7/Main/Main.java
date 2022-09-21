package assignment01.Assignment7.Main;

import assignment01.Assignment7.VectorEvenNumber.VectorEvenNumber;

public class Main {
    public static void main(String args[]) {
    VectorEvenNumber assign =new VectorEvenNumber();

        assign.saveEvenNumbers(11);
        assign.printEvenNumbers();
        int contains = assign.printEvenNumber(3);

        System.out.println(contains);

    }
}
