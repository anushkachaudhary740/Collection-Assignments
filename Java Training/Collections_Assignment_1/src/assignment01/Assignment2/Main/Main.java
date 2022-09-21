package assignment01.Assignment2.Main;

import assignment01.Assignment2.Employee.Employee;
import assignment01.Assignment2.EmployeeDB.EmployeeDB;

public class Main {
    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee emp1=new Employee(1,"Anu","anu@g.com",'f',5000);
        Employee emp2=new Employee(2,"Stu","stu@g.com",'f',15000);
        Employee emp3=new Employee(3,"Anju","anju@g.com",'m',2000);
        Employee emp4=new Employee(4,"Mira","mira@g.com",'f',35000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for(Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());
        System.out.println();
        empDb.deleteEmployee(2);

        for(Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();
        System.out.println(empDb.showPaySlip(3));

    }


}


