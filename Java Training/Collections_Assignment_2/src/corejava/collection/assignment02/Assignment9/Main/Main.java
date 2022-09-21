package corejava.collection.assignment02.Assignment9.Main;
import corejava.collection.assignment02.Assignment9.Anagram.Anagram;

import java.util.*;
public class Main {
    public static List<String> listAnagrams(List<String> list, String w)
    {
        Anagram ana =new Anagram();
        List<String> subList = new ArrayList<>();
        for(String i : list)
        {
            if(ana.anagram1(i, w)==true)
            {
                subList.add(i);
            }
        }

        return subList;
    }
    public static void main(String[] args) {
        List<String>list=new ArrayList<String>();
        list.add("enlists");
        list.add("google");
        list.add("inlets");
        list.add("banana");
        String word="listen";
        List<String> ans = listAnagrams(list, word);
        System.out.print(ans);
    }

}

