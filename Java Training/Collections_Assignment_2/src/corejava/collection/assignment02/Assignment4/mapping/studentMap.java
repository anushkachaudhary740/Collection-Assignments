package corejava.collection.assignment02.Assignment4.mapping;

import corejava.collection.assignment02.Assignment4.model.Student;

public class studentMap {
    public static Student map(String data) {
        String [] splitArray = data.split(",");
        Integer studentId = Integer.parseInt(splitArray[0]);
        Integer studentMarks = Integer.parseInt(splitArray[2]);

        Student student = new Student();
        student.setStudentId(studentId);
        student.setStudentMarks(studentMarks);
        return student;
    }
}
