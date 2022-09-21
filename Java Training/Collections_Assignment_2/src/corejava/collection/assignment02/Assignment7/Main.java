package corejava.collection.assignment02.Assignment7;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        int n1 = list1.size();
        int n2 = list2.size();
        if(n1<n2 && list2.containsAll(list1)==true)
        {
            System.out.println("list1 is a sublist of list2");
        }
        else if(n1>n2 && list1.containsAll(list2)==true)
        {
            System.out.println("list1 is a superlist of list2");
        }
        else if(n1==n2 && list2.containsAll(list1)==true && list1.containsAll(list2)==true)
        {
            System.out.println("list1 is Equal to list2");
        }
        else
        {
            System.out.println("none");
        }
    }
}