package corejava.collection.assignment02.Assignment4.main;
import corejava.collection.assignment02.Assignment4.parser.StudentParser;
import corejava.collection.assignment02.Assignment4.solution.GetAvgMark;
import corejava.collection.assignment02.Assignment4.model.Student;
import corejava.collection.assignment02.Assignment4.mapping.studentMap;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
       String input [] = {  "22, Data Structures,45", "23, English,52", "22, English,51",
               "26, Data Structures,72", "23, Data Structures,61", "24, English,81"};
        StudentParser inputParser=new StudentParser();
        studentMap inputPasser =new studentMap();
        List<Student> studentArrayList=inputParser.parseArray(input);
        GetAvgMark op = new GetAvgMark(studentArrayList);
        Integer minimumIdInList = op.findMinimumInList();

        Float average =  op.findAverage(minimumIdInList);
        op.printOutput(average);



        String filePath="/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment4/inputfile/fileinput";
        List<Student> studentList=inputParser.parseFile(filePath);
        GetAvgMark om = new GetAvgMark(studentList);

        Integer fileminimumIdInList = om.filefindMinimumInList();

        Float fileaverage =  om.filefindAverage(fileminimumIdInList);
        om.fileprintOutput(fileaverage);

        //inputParser.parseCSVFile(filePath);

    }

}