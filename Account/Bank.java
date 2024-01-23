package Account;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accArray = new ArrayList<>();
    int index = 0;
    double interestAvg;
    int cnt;

    public Bank() {
    }

    // public Bank(int num){
    //     accArray = new Account[num];
    // }

    public void createAccount(Account account){
        accArray.add(account);
    }

    public void deleteAccount(Account account){
        accArray.remove(account);
    }

    public void addinterestAll(){
        for(Account account : accArray){
            if(account instanceof SavingAccount && !(account instanceof StudentAccount)){   // Saving만 이자 주고 Student는 만기 시에만 이자 줌
                ((SavingAccount)account).addinterest();
            }
        }
    }

    public double interestAvgCal(){
        for(Account account : accArray){
            if(account instanceof SavingAccount && !(account instanceof StudentAccount)){   // Saving만 이자 주고 Student는 만기 시에만 이자 줌
                interestAvg += ((SavingAccount) account).getInterest();
                cnt++;
            }
        }
        interestAvg /= (double)cnt;
        return interestAvg;
    }

    public void print(){
       
            System.out.println(accArray.toString());
        
    }
}