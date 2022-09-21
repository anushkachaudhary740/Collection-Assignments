package corejava.collection.assignment02.Assignment3.Main;
import corejava.collection.assignment02.Assignment3.Library.Library;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Library> list = new ArrayList<Library>();
        list.add(new Library("Mail Server", "Authentication Library", "v6"));
        list.add(new Library("Video Call Server", "Authentication Library", "v7"));
        list.add(new Library("Mail Server", "Data Storage Library", "v10"));
        list.add(new Library( "Server", "Data Storage Library", "v11"));
        list.add(new Library("Mail Server", "Search Library", "v6"));
        list.add(new Library("Chat Server", "Authentication Library", "v8"));
        list.add(new Library("Chat Server", "Presence Library", "v2"));
        list.add(new Library("Video Call Server", "Data Storage Library", "v10"));
        list.add(new Library("Video Call Server", "Video Compression Library", "v3"));

        HashMap<String,Integer>highest = new HashMap<String,Integer>();
        Iterator<Library>it = list.iterator();
        while(it.hasNext())
        {
            Library lib = it.next();
            if(highest.containsKey(lib.getLibraryName()))
            {
                highest.replace(lib.getLibraryName(),Math.max(highest.get(lib.getLibraryName()), lib.getVersion()));
            }
            else
            {
                highest.put(lib.getLibraryName(), lib.getVersion());
            }
        }
        Set<String>st = new HashSet<String>();
        Iterator<Library>it1=list.iterator();
        while(it1.hasNext())
        {
            Library lib = it1.next();
            if(lib.getVersion()<highest.get(lib.getLibraryName()))
            {
                st.add(lib.getProductName());
            }
        }
        for(String s:st)
        {
            System.out.println(s);
        }
    }
}
