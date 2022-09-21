package corejava.collection.assignment02.Assignment6.Main;
import corejava.collection.assignment02.Assignment6.Candidate.Candidate;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Candidate> list = new ArrayList<>();

        list.add(new Candidate(22, "Ravi Pawar", "Aundh", 1603));
        list.add(new Candidate(23, "Suvarna Kale", "Baner", 803));
        list.add(new Candidate(27, "Vinod Chavan", "Aundh", 809));
        list.add(new Candidate(29, "Vasant Mahajan", "Aundh", 617));
        list.add(new Candidate(32, "Aarti Patil", "Baner", 351));
        list.add(new Candidate(34, "Swaran Bijur", "Baner", 352));

        Set<String> places = new HashSet<>();
        Iterator<Candidate> it1 = list.iterator();
        while (it1.hasNext()) {
            Candidate cd = it1.next();
            places.add(cd.getPlace());
        }

        for (String place : places) {
            List<Integer> votes = new ArrayList<>();
            Iterator<Candidate> it = list.iterator();
            while (it.hasNext()) {
                Candidate values = it.next();
                String getPlace = values.getPlace();

                if (place.equals(getPlace)) {
                    votes.add(values.getCandidateVotes());
                }
            }
            Integer maxVotes = Collections.max(votes);

            Iterator<Candidate> it2 = list.iterator();
            while (it2.hasNext()) {
                Candidate values = it2.next();
                Integer getVotes = values.getCandidateVotes();

                if (maxVotes == getVotes) {
                    System.out.println(values.getPlace() + ":" +values.getCandidateId());
                }
            }
        }

    }
}
