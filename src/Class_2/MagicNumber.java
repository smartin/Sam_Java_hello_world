package Class_2;

public class MagicNumber {

    public static void main(String[] args) {

        float price = 20.00f;

        float totalPrice = price * 1.1556f;


        System.out.println(totalPrice);

        // A BETTER WAY

        final float TAX_RATE2 = 1.556f;
        float price2 = 20.00f;
        float totalPrice2 = price * TAX_RATE2;



    }

}
