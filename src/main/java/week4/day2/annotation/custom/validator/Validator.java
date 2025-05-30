package week4.day2.annotation.custom.validator;

import week4.day2.annotation.custom.CarRequest;
import week4.day2.annotation.custom.annotation.YearRange;

import java.lang.reflect.Field;

public class Validator {
    public static void validateYear(CarRequest request) {
        try {
            Field field = request.getClass().getDeclaredField("year");
            field.setAccessible(true);
            YearRange yr = field.getAnnotation(YearRange.class);

            int year = request.getYear();

            if (year < yr.min() || year > yr.max()) {
                throw new IllegalArgumentException("Invalid year range");
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("No such field");
        }
    }
}
