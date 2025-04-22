package week4.day2.annotation.custom;

import org.junit.jupiter.api.Test;

class CustomAnnotationMainTest {
    @Test
    public void testValidYearRange() {
        Car car = CarFactory.createCar(new CarRequest("BMW", 2021));
        System.out.println(car);
    }

    @Test
    public void testInvalidYearRang() {
        Car car = CarFactory.createCar(new CarRequest("BMW", 2026));
        System.out.println(car);
    }

}