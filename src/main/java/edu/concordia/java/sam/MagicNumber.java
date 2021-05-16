package edu.concordia.java.sam;

/**
 * Build and run with:
 * mvn clean install
 */
public class MagicNumber {

    public static void main(String[] args) {

        // Arguments
        final float ARG_TAX_RATE = Float.parseFloat(args[0]);
        final float ARG_PRICE = Float.parseFloat(args[2]);

        // Calculation
        float totalPrice = ARG_PRICE * ARG_TAX_RATE;

        // Output response
        final String output = String
            .format("\nPrice: %s, Tax rate: %s\nResult = %s\n", ARG_PRICE, ARG_TAX_RATE, totalPrice);
        System.out.println(output);
    }

}
