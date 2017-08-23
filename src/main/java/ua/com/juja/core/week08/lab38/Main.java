package ua.com.juja.core.week08.lab38;

public class Main {
    public static void main(String[] args) {
        Account[] testAccounts = new Account[3];
        int[] testDelta = {100, 343, 245};
        int amountAcc1 = 10;
        int amountAcc2 = 5;
        int amountAcc3 = 25;

        Account accountTwoTryAgainException = new Account(amountAcc1) {
            int countCall = 0;

            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                if (countCall < 2) {
                    countCall++;
                    throw new TryAgainException();
                } else {
                    amount = amount + delta;
                }

            }
        };

        Account accountThreeTryAgainException = new Account(amountAcc2) {
            int countCall = 0;

            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                if (countCall < 3) {
                    countCall++;
                    throw new TryAgainException();
                } else {
                    amount = amount + delta;
                }
            }
        };

        Account accountNoTryAgainException = new Account(amountAcc3) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                //no exception
                amount = amount + delta;
            }
        };

        testAccounts[0] = accountTwoTryAgainException;
        testAccounts[1] = accountThreeTryAgainException;
        testAccounts[2] = accountNoTryAgainException;

        // call
        boolean actualResultTransfer = AccountManager.transfer(testAccounts, testDelta);

        //check
        if (!actualResultTransfer)
            throw new AssertionError("should to be result transfer is true but found false");

        if (testAccounts[0].getAmount() != testDelta[0] + amountAcc1)
            throw new AssertionError("Account should be equals " + (testDelta[0] + amountAcc1) + " but found " + testAccounts[0].getAmount());

        if (testAccounts[1].getAmount() != testDelta[1] + amountAcc2)
            throw new AssertionError("Account should be equals " + (testDelta[1] + amountAcc2) + " but found " + testAccounts[1].getAmount());

        if (testAccounts[2].getAmount() != testDelta[2] + amountAcc3)
            throw new AssertionError("Account should be equals " + (testDelta[2] + amountAcc3) + " but found " + testAccounts[2].getAmount());

        System.out.print("OK");

    }
}
