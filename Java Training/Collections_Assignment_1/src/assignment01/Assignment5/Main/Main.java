package assignment01.Assignment5.Main;

import assignment01.Assignment5.Employee.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(11, "Anu",20000.0));
        list.add(new Employee(12, "Ami",30000.0));
        list.add(new Employee(13, "Jon",25000.0));
        list.add(new Employee(14, "Sit",40000.0));

        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            System.out.println(emp);
        }
    }

}
