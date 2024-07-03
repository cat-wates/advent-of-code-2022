package adventofcode2022.day3;

public class CommonItemFinder {

    Rucksack rucksack;
    char commonItem;

    public CommonItemFinder(Rucksack rucksack) {
        this.rucksack = rucksack;
    }

    public char compareCompartments(String compartmentOne, String compartmentTwo) {
        for (int i = 0; i < compartmentOne.length(); i++) {
            for (int j = 0; j < compartmentTwo.length(); j++) {
                if (compartmentOne.charAt(i) == compartmentTwo.charAt(j)) {
                    commonItem = compartmentOne.charAt(i);
                    break;
                }
            }
        }
        //if common item is not null (think of solution)
        return commonItem;

    }


}
