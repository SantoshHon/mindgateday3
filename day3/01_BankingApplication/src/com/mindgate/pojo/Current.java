package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double  initionalOverdraftbalance; 

	public Current() {
		System.out.println("Default constructor of current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		initionalOverdraftbalance=overdraftBalance;
		System.out.println("Overloaded Constructor of current");
	}

	@Override
	public boolean withdraw(double amount) {
		if(amount>0)
		{
			if(amount<=getBalance())
			{
				setBalance(getBalance()-amount);
				return true;
			}
			if(amount<=getBalance()+overdraftBalance)
			{amount=amount-getBalance();
			setBalance(0);
			overdraftBalance=overdraftBalance-amount;
			return true;
				
			}
		}
		
		return false;
	}
//	@Override
//	public boolean withdraw(double amount) {
//		if(amount>0)
//		{
//		if (amount < getBalance()) {
//			setBalance(getBalance() - amount);
//			return true;
//		}
//		if (amount > getBalance()) {
//			
//			setOverdraftBalance((getOverdraftBalance() + getBalance()) - amount);
//			setBalance(0);
//			return true;
//		}}
//		return false;
//	} 
	
	@Override
	public boolean deposite(double amount) {
		if(amount>0)
		{
			if(initionalOverdraftbalance>overdraftBalance)
			{
				if(amount<(initionalOverdraftbalance-overdraftBalance))
				{
					overdraftBalance=overdraftBalance+amount;
					return true;
					
				}else
				{
					amount=amount-(initionalOverdraftbalance-overdraftBalance);
					setBalance(getBalance()+amount);
					overdraftBalance=initionalOverdraftbalance;
					return true;
				}
			}
			else
				setBalance(getBalance()+amount);
			return true;
		}
		return false;
	}
//	@Override
//	public boolean deposite(double amount) {
//	if(amount>0) {
//	if(amount+getOverdraftBalance()<initionalOverdraftbalance)
//	{
//		setOverdraftBalance(getOverdraftBalance()+amount);
//	}
//		
//	else
//	{ double b=initionalOverdraftbalance-getOverdraftBalance();
//		setOverdraftBalance(initionalOverdraftbalance);
// 		setBalance(amount-b);
//	}}
//		return false;
//	}
//
	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
