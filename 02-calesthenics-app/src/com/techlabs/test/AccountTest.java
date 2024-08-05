package com.techlabs.test;

import com.techlabs.model.Account;
import com.techlabs.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {

       Account account1=new Account(1001,"Sarthak",1500000,AccountType.SAVINGS);
       
       System.out.println(account1);

	}

}
