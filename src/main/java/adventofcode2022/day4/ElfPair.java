package adventofcode2022.day4;

public class ElfPair {

    String elfOne;
    String elfTwo;
    String elfPair;


    public ElfPair(String elfPair) {
        this.elfPair = elfPair;
        elfOne = elfPair.substring(0, elfPair.indexOf(","));
        elfTwo = elfPair.substring(elfPair.indexOf(",") + 1);
    }

    public String[] splitIntoBounds(String elf) {
        return elf.split("-");
    }

    public boolean completeDuplicateChecker(String[] elfOneBounds, String[] elfTwoBounds) {
        int elfOneLowerBound = Integer.parseInt(elfOneBounds[0]);
        int elfOneUpperBound = Integer.parseInt(elfOneBounds[1]);
        int elfTwoLowerBound = Integer.parseInt(elfTwoBounds[0]);
        int elfTwoUpperBound = Integer.parseInt(elfTwoBounds[1]);
        if (elfOneUpperBound <= elfTwoUpperBound && elfOneLowerBound >= elfTwoLowerBound) {
            return true;
        } else if (elfTwoUpperBound <= elfOneUpperBound && elfTwoLowerBound >= elfOneLowerBound) {
            return true;
        } else {
            return false;
        }
    }

    public boolean anyDuplicateChecker(String[] elfOneBounds, String[] elfTwoBounds) {
        int elfOneLowerBound = Integer.parseInt(elfOneBounds[0]);
        int elfOneUpperBound = Integer.parseInt(elfOneBounds[1]);
        int elfTwoLowerBound = Integer.parseInt(elfTwoBounds[0]);
        int elfTwoUpperBound = Integer.parseInt(elfTwoBounds[1]);
        if (elfOneLowerBound <= elfTwoLowerBound && elfTwoLowerBound <= elfOneUpperBound) {
            return true;
        } else if (elfOneLowerBound <= elfTwoUpperBound && elfTwoLowerBound <= elfOneUpperBound) {
            return true;
        } else if (elfTwoLowerBound <= elfOneUpperBound && elfOneUpperBound <= elfTwoUpperBound) {
            return true;
        } else if (elfTwoLowerBound <= elfOneLowerBound && elfOneLowerBound <= elfTwoUpperBound) {
            return true;
        } else {
            return false;
        }


    }


}
