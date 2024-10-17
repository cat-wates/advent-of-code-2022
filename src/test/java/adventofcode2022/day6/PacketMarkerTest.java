package adventofcode2022.day6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PacketMarkerTest {

    @Test
    public void shouldFindMarkerPositionWhenNoDuplicateCharsPresent() {
//        Given
        String packet = "mlpke";
//        When
        PacketMarker pm = new PacketMarker();
        int markerPosition = pm.findMarkerPosition(packet, 4);
//        Then
        assertThat(markerPosition).isEqualTo(4);
    }

    @Test
    public void shouldFindMarkerPositionWhenSingleDuplicateCharsPresent() {
//        Given
        String packet = "mlmpke";
//        When
        PacketMarker pm = new PacketMarker();
        int markerPosition = pm.findMarkerPosition(packet, 4);
//        Then
        assertThat(markerPosition).isEqualTo(5);
    }

    @Test
    public void shouldFindMarkerPositionWhenMultipleDuplicateCharsPresent() {
//        Given
        String packet = "mmlmpmdmke";
//        When
        PacketMarker pm = new PacketMarker();
        int markerPosition = pm.findMarkerPosition(packet, 4);
//        Then
        assertThat(markerPosition).isEqualTo(10);
    }
}
