package adventofcode2022.day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PacketMarker {

    public int findMarkerPosition(String packet, int size) {
        for (int i = 0; i < packet.length(); i++) {
            String consecutiveValues = packet.substring(i, i+size);
            //map
            //1. create map
            //2. loop through substring and add keys based on chars
            //3. check if key present in each loop through
            //4. if not present, add (or .put())
            //5. if present, do nothing
            //6. check number of keys in map
            //7. if less than 4, continue loop
            //8. if equals 4, return i+4
//            Map<Character, Integer> characterCount = new HashMap<>();
//            for (int j = 0; j < consecutiveValues.length(); j++) {
//                characterCount.put(consecutiveValues.charAt(j), 1);
//            }
//            if (characterCount.size() == 4) {
//                return i+4;
//            }
            //set
            List<String> list = Arrays.asList(consecutiveValues.split(""));
            Set<String> characterSet = new HashSet<>(list);
            if (characterSet.size() == size) {
                return i+size;
            }
        }
        return 0;
    }
}
