package com.au.junit.service.test;


import com.au.junit.instance.Instance;
import com.au.junit.service.ServiceLog;
import com.au.junit.service.impl.ServiceLogImpl;

public class TestEntry  {

	ServiceLog servicelog =  new ServiceLogImpl();
	
	public boolean addUser(Instance user) {
		
		return servicelog.addUser(user);
	}

	public boolean checkEmail(String email) {
		return servicelog.checkEmail(email);
	}

	public boolean checkAge(int age) {
		return servicelog.checkAge(age);
	}

	public boolean checkName(String name) {
		return servicelog.checkName(name);
	}

}
