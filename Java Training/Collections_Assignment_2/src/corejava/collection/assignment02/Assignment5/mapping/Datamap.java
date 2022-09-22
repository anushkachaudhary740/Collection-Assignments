package corejava.collection.assignment02.Assignment5.mapping;
import corejava.collection.assignment02.Assignment5.model.Student;
public class Datamap {
    public static Student map(String data) {
        String []splitArray = data.split(",");
        Integer studentId=Integer.parseInt(splitArray[0]);
        String studentName =splitArray[1];
        String department = splitArray[2];
        Integer Salary = Integer.parseInt(splitArray[3]);

        Student sal = new Student();
        sal.setStudentId(studentId);
        sal.setStudentName(studentName);
        sal.setDepartment(department);
        sal.setSalary(Salary);

        return sal;
    }
}
