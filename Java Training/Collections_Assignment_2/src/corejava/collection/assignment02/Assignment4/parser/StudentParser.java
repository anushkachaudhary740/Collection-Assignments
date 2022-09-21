package corejava.collection.assignment02.Assignment4.parser;
import corejava.collection.assignment02.Assignment4.mapping.studentMap;
import corejava.collection.assignment02.Assignment4.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class StudentParser {

    public List<Student> parseArray(String[] inputData) {
        List<Student> list = new ArrayList<Student>();
        for(String data: inputData) {
            Student student = studentMap.map(data);
            list.add(student);
        }
        return list;
    }

    public List<Student> parseFile(String filePath)  {
        List<Student> list = new ArrayList<Student>();
        // TODO: write code to read file line by line and parse the line.
        try{
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String stf;

        while ((stf = br.readLine()) != null) {
            Student student = studentMap.map(stf);
            list.add(student);
            //System.out.println(stf);
        }
        }catch(IOException e){
            System.out.println("File not found");
        }
        return list;
    }

}