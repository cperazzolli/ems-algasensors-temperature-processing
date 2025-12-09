package com.cperazzolli.algasensors.temperature.processing;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.UUID;

public class UUIDv7Utils {

    private UUIDv7Utils() {
    }

    public static OffsetDateTime extractOffisetDateTime(UUID uuid) {
        if(uuid == null) {
            return null;
        }

        long timestamp = uuid.getMostSignificantBits() >>> 16;

        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
    }
}
