package corejava.collection.assignment02.Assignment5.mapper;
import corejava.collection.assignment02.Assignment5.model.SalaryStructure;
public class mapSalary {
    public static SalaryStructure map(String data) {
        String []splitArray = data.split(",");
        String department = splitArray[2];
        Integer Salary = Integer.parseInt(splitArray[3]);

        SalaryStructure sal = new SalaryStructure();

        sal.setDepartment(department);
        sal.setSalary(Salary);

        return sal;
    }
}
