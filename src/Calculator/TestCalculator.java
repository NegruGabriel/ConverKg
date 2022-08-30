package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void InitialCurrentNumberIsZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.getCurrentNumber(), 0);
    }

    

    @Test
    public void Add_WithPositiveNumber_CurrentNumberIsAddedNumber() {
        Calculator calculator = new Calculator();
        double number = 12.3;

        calculator.Add(number);
        Assert.assertEquals(number, calculator.getCurrentNumber(), 0);
    }

    @Test
    public void Add_With2PositiveNumbers_CurrentNumberIsTheirSum() {
        Calculator calculator = new Calculator();
        double a = 12.3;
        double b = 24.01;

        calculator.Add(a);
        calculator.Add(b);
        Assert.assertEquals(a + b, calculator.getCurrentNumber(), 0);
    }

    @Test
    public void Suntract_WithPositiveNumber_CurrentNumberIsMinusSubtractedNumber() {
        Calculator calculator = new Calculator();
        double number = 12.3;

        calculator.Subtract(number);
        Assert.assertEquals(-number, calculator.getCurrentNumber(), 0);
    }
}