package corejava.collection.assignment02.Assignment4.solution;
import corejava.collection.assignment02.Assignment4.model.Student;
import corejava.collection.assignment02.Assignment4.mapper.studentMap;
import java.util.*;
public class Operations {
    List studentArrayList = new ArrayList<>();

    public void getInput(String input[]) {

        for (String data : input) {

            Student student = studentMap.map(data);
            studentArrayList.add(student);
        }
    }

    public void printOutput(Float average) {
        System.out.println("Average Marks: " + average);
    }

    // get lowest id from the list of students
    public Integer findMinimumInList() {
        List<Integer> minId = new ArrayList<>();

        Iterator<Student> it = studentArrayList.iterator();

        while (it.hasNext()) {
            Student values = it.next();
            minId.add(values.getStudentId());
        }
        Integer minimumIdInList = Collections.min(minId);
        return minimumIdInList;

    }

    // get average marks for the student having lowest id
    public Float findAverage(Integer minimumIdInList) {

        Iterator<Student> it2 = studentArrayList.iterator();
        Integer sum = 0;
        Integer temp = 0;
        while (it2.hasNext()) {
            Student values = it2.next();
            if (minimumIdInList == values.getStudentId()) {
                sum += values.getStudentMarks();
                temp++;
            }
        }
        Float average = (float) (sum / temp);
        return average;
    }

}

