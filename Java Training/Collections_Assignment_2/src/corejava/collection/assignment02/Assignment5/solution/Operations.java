package corejava.collection.assignment02.Assignment5.solution;
import corejava.collection.assignment02.Assignment5.mapper.mapSalary;
import corejava.collection.assignment02.Assignment5.model.SalaryStructure;
import java.util.*;
public class Operations {
    List<SalaryStructure> list = new ArrayList<>();
    public void mapData(String [] input) {
        for (String data : input) {
            SalaryStructure sal = mapSalary.map(data);
            list.add(sal);
        }
    }

    public Integer maxSalary() {
        List getAllSalaryInList = new ArrayList<>();
        Iterator it = list.iterator();
        while(it.hasNext()) {
            SalaryStructure values = (SalaryStructure) it.next();

            getAllSalaryInList.add(values.getSalary());

        }
        Integer maxSalary = (Integer) Collections.max(getAllSalaryInList);
        return maxSalary;
    }

    public void printData(Integer maxSalary) {
        Iterator it2 = list.iterator();
        while(it2.hasNext()) {
            SalaryStructure values = (SalaryStructure) it2.next();
            Integer getSalary = values.getSalary();
            if(maxSalary == getSalary) {
                System.out.println( values.getDepartment()+" : "+ maxSalary);
            }
        }
    }
}
