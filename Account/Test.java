package Account;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate allowWithdrawDate = LocalDate.of(2060,1,1);

        SavingAccount savingAccount = new SavingAccount(0, 1.5);
        savingAccount.deposit(50000);
        CheckingAccount checkingAccount = new CheckingAccount(1, 20);
        checkingAccount.deposit(100000);
        StudentAccount studentAccount = new StudentAccount(2, 3.5, now);
        studentAccount.deposit(50000);

        Bank bank = new Bank();
        bank.createAccount(savingAccount);
        bank.createAccount(checkingAccount);
        bank.createAccount(studentAccount);


        System.out.println("===기존금액===");
        bank.print();
        System.out.println("===이자붙은거===");
        bank.addinterestAll();
        bank.print();

        System.out.println();
        System.out.println("===초과인출===");
        checkingAccount.draft(50000000);
        System.out.println();


        System.out.println("===학생적금깨기 (적금 만기시 이자 지급됨)===");
        double avg = bank.interestAvgCal();
        studentAccount.studentWithdraw(15000, allowWithdrawDate, avg);

        System.out.println("===Acc1 삭제===");
        bank.deleteAccount(checkingAccount);
        bank.print();


    }
    
}