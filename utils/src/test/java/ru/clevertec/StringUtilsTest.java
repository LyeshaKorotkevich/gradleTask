package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    @Test
    void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("10"));
        assertFalse(StringUtils.isPositiveNumber("-7"));
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("lol"));
    }
}
