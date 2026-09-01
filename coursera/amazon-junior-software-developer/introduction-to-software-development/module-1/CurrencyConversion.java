public class CurrencyConversion {
    public static void main(String[] args) {
        //1. Declare a variable to hold the amount in USD
        double amountInUSD = 100.0;
        double exchangeRateUSDToEUR = 0.85;

        //2. Print the initial amount in USD
        System.out.println("Initial amount in USD: " + amountInUSD);

        //3. Convert the amount to EUR using the exchange rate
        double amountInEUR = amountInUSD * exchangeRateUSDToEUR;

        //4. Print the converted amount in EUR
        System.out.println("Amount in EUR after conversion: " + amountInEUR);

        //5. Subtract an expenditure of 55 EUR from the converted amount
        amountInEUR -= 55.0;
        System.out.println("Amount in EUR after expenditure: " + amountInEUR);

        //6. Convert the remaining amount back to USD using the same exchange rate
        double amountAfterConvertingBack = amountInEUR / exchangeRateUSDToEUR;
        System.out.printf("Amount in USD after converting back: %.2f", amountAfterConvertingBack);

    }
}