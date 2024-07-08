package adventofcode2022.day3;

import java.util.ArrayList;

public class BadgeFinder {

    ArrayList<String> rucksacks;
    char badge;

    public BadgeFinder(ArrayList<String> rucksacks) {
        this.rucksacks = rucksacks;
    }

    public ArrayList<Character> findBadge(ArrayList<String> rucksacks) {
        ArrayList<Character> badges = new ArrayList<>();
        for (int i = 0; i < rucksacks.size(); i+= 3) {
           String elfOne = rucksacks.get(i);
           String elfTwo = rucksacks.get(i+1);
           String elfThree = rucksacks.get(i+2);
           for (int j = 0; j < elfOne.length(); j++) {
               for (int k = 0; k < elfTwo.length(); k++) {
                   for (int l = 0; l < elfThree.length(); l++) {
                       if (elfOne.charAt(j) == elfTwo.charAt(k) && elfTwo.charAt(k) == elfThree.charAt(l)) {
                           badge = elfOne.charAt(j);
                           badges.add(badge);
                           break;
                       }
                   }
               }
           }
        }
        return badges;
    }


}
