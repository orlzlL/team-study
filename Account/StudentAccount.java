package Account;
import Account.Bank;
import java.time.LocalDate;

public class StudentAccount extends SavingAccount {
    // private int withdrawYear;
    private LocalDate savingStart = null;
    private LocalDate mature = null;
    Bank bank = new Bank();
//    private double interest;
    public StudentAccount(int a, double interest, LocalDate savingStart){
        super(a, interest);
        this.savingStart = savingStart;
//        this.interest = interest;
        mature = savingStart.plusYears(5);

    }

    public boolean studentWithdraw(double sum, LocalDate allowWithdrawDate, double interestAvg){
        if(allowWithdrawDate.isBefore(mature)){
           System.out.println("아직 인출할 수 없습니다.");
           return false;
        } else {
            deposit(getBalance() * ((interestAvg+3.0)/(double)100));    // 만기 시에만 이자 줌

            System.out.println(toString());
            withdraw(sum);
            return true;
        }
    }

    
}