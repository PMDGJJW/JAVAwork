package text21;

import text19.NoLifeValueExption;

public class DebitCard {
    private String accountNumber ;
    private  int money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, int money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
        if(money<0){
            throw new NoLifeValueExption("余额不能为负数");
        }
    }
}
