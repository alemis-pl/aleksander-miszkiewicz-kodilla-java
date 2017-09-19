package com.kodilla.exception.challange;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("You have tried divide by 0!");
        }finally {
            System.out.println("Do not divide by 0 because the result always will equal 0!");
        }
    }
}
