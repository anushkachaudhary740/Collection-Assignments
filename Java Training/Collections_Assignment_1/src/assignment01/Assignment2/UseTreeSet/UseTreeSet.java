package assignment01.Assignment2.UseTreeSet;

import assignment01.Assignment2.Employee.Employee;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class UseTreeSet {
    static Set<Employee> eTreeSet = new TreeSet<Employee>();

    public boolean addEmployee(Employee e) {

        return eTreeSet.add(e);
    }

    public boolean deleteEmployee(Integer empId) {
        Iterator<Employee> it = eTreeSet.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            if (e.getEmpId() == empId) {
                return eTreeSet.remove(e);
            }
        }
        return false;
    }

    public String showPaySlip(Integer empId) {
        Iterator<Employee> it = eTreeSet.iterator();
        String paySlip;
        while (it.hasNext()) {
            Employee e = it.next();
            if (e.getEmpId() == empId) {
                paySlip = "Name: " + e.getEmpName() + "\nEmail: " + e.getEmpEmail() + "\nGender: " + e.getEmpGender()
                        + "\nSalary: " + e.getEmpSalary();
                return paySlip;
            }
        }
        return null;
    }

    Employee[] listAll() {
        int count = 0;
        Employee[] emp = new Employee[eTreeSet.size()];
        Iterator it = eTreeSet.iterator();
        while (it.hasNext()) {
            Employee e = (Employee) it.next();
            emp[count++] = e;
        }
        return emp;
    }
}

