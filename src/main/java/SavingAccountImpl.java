/*
 * Author : Ankit Kishor
 * Date: 07-11-2022
 * Created with :Intellij IDEA Community Edition
 */


import java.time.LocalDate;

public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount();

        savingAccount.setTotalBalance(12345.0);
        savingAccount.setAccountHolderName("ankit");
        savingAccount.setAccountStatus("current");
        savingAccount.setAccountNumber(1200130);
        savingAccount.setAccountAvailableBalance(10000);
        savingAccount.setUpiEnabledBanking(true);
        savingAccount.setInterestRate(12);
        savingAccount.setAccountOpeningDate(LocalDate.of(2012,12,12));

        System.out.println("account information");
        System.out.println(savingAccount.getAccountHolderName());
        System.out.println(savingAccount.getAccountStatus());
        System.out.println(savingAccount.getAccountNumber());
        System.out.println(savingAccount.getAccountAvailableBalance());
        System.out.println(savingAccount.upiEnabledBanking);
        System.out.println(savingAccount.getInterestRate());
        System.out.println("total balance "+savingAccount.retrieveBalance());
        System.out.println("balance after debit "+savingAccount.debitBalance(2345));
        System.out.println("balance after credit "+ (savingAccount.creditBalance(1)));

    }
}
