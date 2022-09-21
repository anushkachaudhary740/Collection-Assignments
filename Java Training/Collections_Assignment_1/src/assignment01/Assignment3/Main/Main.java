package assignment01.Assignment3.Main;

import assignment01.Assignment3.Solution.Solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anushka");
        list.add("Akshita");
        list.add("Shivam");
        list.add("Anuj");
        Solution ans=new Solution();
        ans.printAll(list);
    }
}
