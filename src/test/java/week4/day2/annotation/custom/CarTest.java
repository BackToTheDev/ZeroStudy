package week4.day2.annotation.custom;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testGetModel_Ionic() {
        Car car = new Car("Ionic", 2021);
        car.getModel();

    }

    @Test
    void testGetModel_Sonata() {
        Car car = new Car("Sonata", 2021);
        car.getModel();
    }

    @Test
    void testGetModel_Grandeur() {
        Car car = new Car("Grandeur", 2021);
        car.getModel();
    }

    @Test
    void testGetModel_Avante() {
        Car car = new Car("Avante", 2021);
        car.getModel();
    }

    @Test
    void testGetModel_Morning() {
        Car car = new Car("Morning", 2021);
        car.getModel();
    }

    @Test
    void testGetModel_Unknown() {
        Car car = new Car("Unknown", 2021);
        car.getModel();

    }
}