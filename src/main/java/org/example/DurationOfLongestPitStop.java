package org.example;

import java.util.List;

//czas trwania najdłuższego pit stopu wraz z numerem kierowcy

public class DurationOfLongestPitStop {

    public static Pitstop findLongestPitStop(List<Pitstop> pitstops) {

        Pitstop longestPitStop = pitstops.get(0);

        for (Pitstop p : pitstops) {
            if (p.getPit_duration() > longestPitStop.getPit_duration()) {
                longestPitStop = p;
            }
        }

        return longestPitStop;
    }
}
