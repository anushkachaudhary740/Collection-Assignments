package assignment01.Assignment5.Employee;

public class Employee{
        private int id;
        private String name;
        private Double salary;

        public Employee(int id, String name, Double salary) {
            super();
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "id=" + id + ", name=" + name + ", salary=" + salary ;
        }
    }

