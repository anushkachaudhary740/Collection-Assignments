package assignment01.Assignment8.Main;

import assignment01.Assignment8.Employee.Employee;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Employee> list = new Vector<>();
        list.add(new Employee(11, "Anu",10000.0));

        list.add(new Employee(12, "Ami",30000.0));
        list.add(new Employee(13, "Jon",53000.0));
        list.add(new Employee(14, "Sit",90000.0));
        System.out.println("By using iterator");
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            System.out.println(emp);
        }
        System.out.println("By using Enumeration");
        Enumeration<Employee> emp = list.elements();
        while (emp.hasMoreElements()) {
            System.out.println(emp.nextElement());
        }
    }

}
