package ru.clevertec;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        if (str.length == 0) return false;
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }

}
