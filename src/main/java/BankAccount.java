/*
 * Author : Ankit Kishor
 * Date: 08-11-2022
 * Created with :Intellij IDEA Community Edition
 */


import java.time.LocalDate;

public abstract class BankAccount {

   private double accountNumber;
   private LocalDate accountOpeningDate;
   private String modeOfOperation;
   private double accountAvailableBalance;
   private double totalBalance;
   private boolean upiEnabledBanking;
   private double interestRate;

    public BankAccount() {
    }

    public BankAccount(double accountNumber,
                       LocalDate accountOpeningDate,
                       String modeOfOperation,
                       double accountAvailableBalance,
                       double totalBalance,
                       boolean upiEnabledBanking,
                       double interestRate) {
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.accountAvailableBalance = accountAvailableBalance;
        this.totalBalance = totalBalance;
        this.upiEnabledBanking = upiEnabledBanking;
        this.interestRate = interestRate;
    }


    public abstract double showAccountBalance();
    public abstract double retrieveBalance();

    public abstract double debitBalance(double price);

    public abstract double creditBalance(double price);


}
