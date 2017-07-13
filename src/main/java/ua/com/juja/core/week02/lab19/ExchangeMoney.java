package ua.com.juja.core.week02.lab19;

public class ExchangeMoney {
    private static final int[] coinsNominals = new int[] {1, 2, 5, 10, 25, 50};

    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsBrutForce(5));
    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {

        if (amountForExchange <=0) return 0;

        int amountVariant = 0;

        int mass;

        for (int i50 = 0; i50 <= amountForExchange / 50 ; i50++) {
            for (int i25 = 0; i25 <= amountForExchange / 25; i25++) {
                for (int i10 = 0; i10 <= amountForExchange / 10; i10++) {
                    for (int i5 = 0; i5 <= amountForExchange / 5; i5++) {
                        for (int i2 = 0; i2 <= amountForExchange / 2 ; i2++) {
                            for (int i1 = 0; i1 <= amountForExchange; i1++) {
                                mass = (i50 * 50 + i25 * 25 + i10 * 10 + i5 * 5 + i2 * 2 + i1);

                                if (mass == amountForExchange) {
                                    amountVariant++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return amountVariant;

    }
}