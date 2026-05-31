import org.example.DurationOfLongestPitStop;
import org.example.Pitstop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DurationOfLongestPitStopTest {

    private List<Pitstop> pitstops;

    @Before
    public void setUp() {
        pitstops = new ArrayList<>();

        pitstops.add(new Pitstop(2.4, 9, 41, 1));
        pitstops.add(new Pitstop(5.1, 15, 16, 1));
        pitstops.add(new Pitstop(3.7, 20, 63, 1));
    }

    @Test
    public void shouldFindLongestPitStop() {
        Pitstop result = DurationOfLongestPitStop.findLongestPitStop(pitstops);

        Assert.assertEquals(5.1, result.getPit_duration(), 0.001);
        Assert.assertEquals(16, result.getDriver_number());
    }
}
