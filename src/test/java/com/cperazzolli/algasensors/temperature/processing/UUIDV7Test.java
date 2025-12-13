package com.cperazzolli.algasensors.temperature.processing;

import com.cperazzolli.algasensors.temperature.processing.common.IdGenerator;
import com.cperazzolli.algasensors.temperature.processing.common.UUIDv7Utils;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class UUIDV7Test {

    @Test
    void shouldGenerateUUIDv7() {
        UUID uuid1 = IdGenerator.generatedTimeBasedUUID();
        UUID uuid2 = IdGenerator.generatedTimeBasedUUID();
        UUID uuid3 = IdGenerator.generatedTimeBasedUUID();
        UUID uuid4 = IdGenerator.generatedTimeBasedUUID();

        System.out.println(uuid1);
        System.out.println(uuid2);
        System.out.println(uuid3);
        System.out.println(uuid4);
    }

    @Test
    void shouldGenerateUUIDv7Timestamp() {
        UUID uuid1 = IdGenerator.generatedTimeBasedUUID();
        UUID uuid2 = IdGenerator.generatedTimeBasedUUID();
        UUID uuid3 = IdGenerator.generatedTimeBasedUUID();
        UUID uuid4 = IdGenerator.generatedTimeBasedUUID();

        System.out.println(UUIDv7Utils.extractOffisetDateTime(uuid1));
        System.out.println(UUIDv7Utils.extractOffisetDateTime(uuid2));
        System.out.println(UUIDv7Utils.extractOffisetDateTime(uuid3));
        System.out.println(UUIDv7Utils.extractOffisetDateTime(uuid4));

    }

    @Test
    void shouldGenerateUUIDv7Assert() {
        UUID uuid = IdGenerator.generatedTimeBasedUUID();

        OffsetDateTime offsetDateTime = UUIDv7Utils.extractOffisetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        assertThat(offsetDateTime).isEqualTo(currentDateTime);
    }
}
