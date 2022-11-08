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

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(LocalDate accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public double getAccountAvailableBalance() {
        return accountAvailableBalance;
    }

    public void setAccountAvailableBalance(double accountAvailableBalance) {
        this.accountAvailableBalance = accountAvailableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public boolean isUpiEnabledBanking() {
        return upiEnabledBanking;
    }

    public void setUpiEnabledBanking(boolean upiEnabledBanking) {
        this.upiEnabledBanking = upiEnabledBanking;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void showAccountBalance(){

    }
}
