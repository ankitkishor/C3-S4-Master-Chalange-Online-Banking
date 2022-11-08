/*
 * Author : Ankit Kishor
 * Date: 07-11-2022
 * Created with :Intellij IDEA Community Edition
 */


import java.time.LocalDate;


public class SavingAccount extends BankAccount {
    private String accountHolderName;
    private String accountStatus;
   private double accountNumber;
    private LocalDate accountOpeningDate;
   private double accountAvailableBalance;
   private double totalBalance;
    boolean upiEnabledBanking;
   private double interestRate;

    public SavingAccount() {
    }

    @Override
    public double showAccountBalance() {
        return totalBalance;
    }

    public SavingAccount(String accountHolderName, String accountStatus, double accountNumber, LocalDate accountOpeningDate, double accountAvailableBalance, double totalBalance, boolean upiEnabledBanking, double interestRate) {
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.accountAvailableBalance = accountAvailableBalance;
        this.totalBalance = totalBalance;
        this.upiEnabledBanking = upiEnabledBanking;
        this.interestRate = interestRate;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
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

    public double retrieveBalance()
    {
        return getTotalBalance();
    }
    public double debitBalance(double price)
    {
        accountAvailableBalance= getTotalBalance()-price;
        return accountAvailableBalance;
    }
    public double creditBalance(double price){

        return accountAvailableBalance+price;
    }
}
