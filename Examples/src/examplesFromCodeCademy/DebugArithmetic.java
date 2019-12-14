package examplesFromCodeCademy;

public class DebugArithmetic {

    public static void main(String[] args) {

        int width = 0;
        int length = 40;
        try {
            int ratio = length / width;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticExcpetion: " + e.getMessage());
        }

    }
}