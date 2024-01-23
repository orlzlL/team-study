package Account;

public class Bank {

    Account[] accarray;
    int index = 0;
    double interestAvg;
    int cnt;

    public Bank() {
    }

    public Bank(int num){
        accarray = new Account[num];
    }

    public void createAccount(Account account){
        accarray[index++] = account;
    }

    public void deleteAccount(Account account){
        accarray[index--] = null;
    }

    public void addinterestAll(){
        for(Account account : accarray){
            if(account instanceof SavingAccount && !(account instanceof StudentAccount)){   // Saving만 이자 주고 Student는 만기 시에만 이자 줌
                ((SavingAccount)account).addinterest();
            }
        }
    }

    public double interestAvgCal(){
        for(Account account : accarray){
            if(account instanceof SavingAccount && !(account instanceof StudentAccount)){   // Saving만 이자 주고 Student는 만기 시에만 이자 줌
                interestAvg += ((SavingAccount) account).getInterest();
                cnt++;
            }
        }
        interestAvg /= (double)cnt;
        return interestAvg;
    }

    public void print(){
        for (int i = 0; i < index; i++) {
            accarray[i].print();
        }
    }
}