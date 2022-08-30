package Calculator;

public class Calculator {

    private double currentNumber;

    public double getCurrentNumber() {
        return currentNumber;
    }

    public Calculator() {
        currentNumber = 0;
    }

    public void Add(double numberToAdd) {
        currentNumber = currentNumber + numberToAdd;
    }

    public void Subtract(double numberToSubtract) {
        currentNumber = currentNumber - numberToSubtract;
    }
}
