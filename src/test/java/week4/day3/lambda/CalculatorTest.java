package week4.day3.lambda;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void teatAdd() {
        Calculator calculator = new Calculator(10, 20);
        int result = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });
        System.out.println(result);
    }

    @Test
    void testAddLamda() {
        Calculator calculator = new Calculator(10, 20);
        int result = calculator.calculate((int a, int b) -> a + b);
        System.out.println(result);
    }

    @Test
    void testAddLambda2() {
        Calculator calculator = new Calculator(10, 20);
        Operate operate = (int a, int b)-> a + b;
        int result = calculator.calculate(operate);

        System.out.println(result);
    }

    @Test
    void testAddLambda3() {
        Calculator calculator = new Calculator(10, 20);
        int result = calculator.calculate(Integer::sum);

        System.out.println(result);
    }

    @Test
    void testAddLambda4() {
        Calculator calculator = new Calculator(10, 40);
        int result = calculator.calculate(getOperate());

        System.out.println();
    }

    private Operate getOperate() {
        return Integer::sum;
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator(30, 10);
        int result = calculator.calculate((int a, int b) -> a - b);
        System.out.println(result);
    }

}