package corejava.collection.assignment02.Assignment8.Main;
import corejava.collection.assignment02.Assignment8.Isogram.Isogram;

import java.lang.String;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Isogram iso = new Isogram();
        List<String>list=new ArrayList<String>();
        list.add("lumberjacks");
        list.add("background");
        list.add("downstream");
        list.add("six-year-old");
        list.add("Anushka");
        for(String i:list){
            System.out.println(iso.isogram(i));
        }
    }
}
