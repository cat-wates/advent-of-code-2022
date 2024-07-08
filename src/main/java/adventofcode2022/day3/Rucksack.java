package adventofcode2022.day3;

public class Rucksack {

    String rucksack;
    String compartmentOne;
    String compartmentTwo;

    public Rucksack(String rucksack) {
        this.rucksack = rucksack;
    }

    public void splitRucksackIntoCompartments(String rucksack) {
            int size = rucksack.length();
            compartmentOne = rucksack.substring(0, size/2);
            compartmentTwo = rucksack.substring(size/2);
    }
}
