package corejava.collection.assignment02.Assignment5.main;

import corejava.collection.assignment02.Assignment5.solution.findDepartmentAndId;

public class Main {
    public static void main(String[] args) {

        String [] input = {"22, Rajan Anand, Engineering,1600000",
                "23, Swati Patil, Testing,800000",
                "27, Vijay Chawda, Engineering,800000",
                "29, Basant Mahapatra, Engineering,600000",
                "32, Ajay Patel, Testing,350000",
                "34, Swaraj Birla, Testing,350000"};

        findDepartmentAndId op = new findDepartmentAndId();
        op.getInput(input);
        op.calculateAnswer();


    }

}
