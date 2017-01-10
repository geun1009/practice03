package prob05;

public class Account {
	private String accountNO;
	private int balance;
	public Account(){
		
	}
	public Account(String accountNo){
		this.accountNO = accountNo;
	}
	public String getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void save(int money){
		setBalance(money+balance);
	}
	public void deposit(int money){
		setBalance(balance-money);
	}
}
