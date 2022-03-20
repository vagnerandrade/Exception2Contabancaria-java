package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdraw) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdraw() {
		return withdrawLimit;
	}

	public void setWithdraw(Double withdraw) {
		this.withdrawLimit = withdraw;
	}
	
	public void deposit(Double amount ) {
		this.balance += amount;
	}
	
	public void withdraw (Double amount) {
		if (amount > this.balance) {
			throw new DomainException("Not enough balance ");
		} if (amount > this.withdrawLimit) {
			throw new DomainException("the amount exceeds withdraw limits");
		}
		this.balance -= amount;
	}
	
	@Override
	
	public String toString() {
		return "new balance: " + balance;
		
	}
	
	
	
	
}
