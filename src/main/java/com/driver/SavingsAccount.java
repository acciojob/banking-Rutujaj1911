package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super();
        this.maxWithdrawalLimit=maxWithdrawalLimit;
        this.rate=rate;

    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        try
        {
            if(maxWithdrawalLimit < amount)
            {
                System.out.println("maximum Withdrawn limit exits");
            }
            else
            {
                throw new Exception("Could not Withdraw: Insufficent balance.");
            }
        }
        catch(Exception bae)
        {
            bae.printStackTrace();
        }
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        return (getBalance()  * rate * years)/ (100 * 12);
    }

    public double getCompoundInterest(int times, int years){
        // Return the amount considering that bank gives compound interest on current amount given times per yeare final
        return getBalance()*1+years*times-getBalance();
    }

}
