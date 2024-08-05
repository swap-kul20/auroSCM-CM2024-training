package com.techlabs.test;

import com.techlabs.model.ISayable;
import com.techlabs.model.SayableImpl;

public class SayableTest {

	public static void main(String[] args) {

       ISayable sayable=new SayableImpl();
       sayable.say();

	}

}
