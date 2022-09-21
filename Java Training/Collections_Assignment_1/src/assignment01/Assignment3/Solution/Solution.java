package assignment01.Assignment3.Solution;

import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void printAll(List<String> list) {
        Iterator<String> it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }



}