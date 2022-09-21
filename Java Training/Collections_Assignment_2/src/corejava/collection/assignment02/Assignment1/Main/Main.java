package corejava.collection.assignment02.Assignment1.Main;
import corejava.collection.assignment02.Assignment1.Software.Software;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Software> list = new ArrayList<Software>();

        list.add(new Software("Server1", "Database", "MySQL", 5.5));
        list.add(new Software("Server2", "dataBase", "MySQL", 5.1));
        list.add(new Software("Server3", "OS", "Ubuntu", 12.04));
        list.add(new Software("Server1", "OS", "Ubuntu", 18.04));
        list.add(new Software("Server2", "OS", "Ubuntu", 12.04));
        list.add(new Software("Server3", "Language", "Python", 2.6));
        Set<String>st = new HashSet<String>();
        HashMap<String,Double>highest = new HashMap<String,Double>();
        Iterator<Software> it = list.iterator();
        while(it.hasNext())
        {
            Software sft = it.next();
            if(highest.containsKey(sft.getOperatingSystem()))
            {
                highest.replace(sft.getOperatingSystem(),Math.max(sft.getVersion(), highest.get(sft.getOperatingSystem())));
            }
            else
            {
                highest.put(sft.getOperatingSystem(), sft.getVersion());
            }
        }
        HashMap<String,Integer>count = new HashMap<String,Integer>();
        Iterator<Software> it1 = list.iterator();
        while(it1.hasNext())
        {
            Software sft = it1.next();
            if(sft.getVersion()<highest.get(sft.getOperatingSystem()))
            {
                if(count.containsKey(sft.getOperatingSystem()))
                {
                    count.replace(sft.getOperatingSystem(), count.get(sft.getOperatingSystem())+1);
                }
                else
                {
                    count.put(sft.getOperatingSystem(), 1);
                }
            }
        }
        for(Map.Entry<String,Integer> entry:count.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }

    }
}
