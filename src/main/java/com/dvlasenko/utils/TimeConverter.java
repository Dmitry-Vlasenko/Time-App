package com.dvlasenko.utils;

import net.time4j.ClockUnit;
import net.time4j.Duration;

public class TimeConverter {
    public String secondsToTimeString(long seconds) {
        Duration<?> duration = Duration.of(seconds, ClockUnit.SECONDS);
        return Duration.Formatter.ofPattern("hh:mm:ss").format(duration.toTemporalAmount());
    }
}
