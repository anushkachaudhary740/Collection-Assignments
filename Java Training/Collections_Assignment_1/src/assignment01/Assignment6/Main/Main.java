package assignment01.Assignment6.Main;

import assignment01.Assignment6.PrinEvenNumber.PrintEvenNumber;

public class Main {
    public static void main(String args[]) {
    PrintEvenNumber assign=new PrintEvenNumber();
        assign.saveEvenNumbers(11);
        assign.printEvenNumbers();
        int contains = assign.printEvenNumber(3);

        System.out.println(contains);

    }
}
