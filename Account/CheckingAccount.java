package Account;

public class CheckingAccount extends Account {

    private double overDraftmount;

    public CheckingAccount (int a, double overDraftmount){
        super(a);
        this.overDraftmount = overDraftmount;
    }

    public void draft(double sum){
        double bal = getBalance();

        if(bal + overDraftmount >= sum){
            withdraw(sum);
        } else{
            System.out.println("부도");
        }
    }

    
}