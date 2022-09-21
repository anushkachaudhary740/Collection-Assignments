package assignment01.Assignment4.Main;

import assignment01.Assignment4.IntNumber.IntNumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IntNumber> list = new ArrayList<>();

        list.add(new IntNumber(11, 10.45f, 23.0d, 230L));
        list.add(new IntNumber(12, 19.45f, 90.0d, 999L));
        Iterator<IntNumber> it = list.iterator();
        while (it.hasNext()) {
            IntNumber emp = it.next();
            System.out.println(emp);
        }
    }
}
