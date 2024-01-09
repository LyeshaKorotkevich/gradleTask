package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    @Test
    void testIsAllPositiveNumber() {
        assertTrue(Utils.isAllPositiveNumbers("10", "2", "999"));
        assertFalse(Utils.isAllPositiveNumbers("-7", "1"));
    }
}
