package com.au.junit.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.au.junit.instance.Instance;
import com.au.junit.service.ServiceLog;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class ServiceLogImpl implements ServiceLog {

	static List<Instance> list = new ArrayList<Instance>(); 
	
	final Logger log = LoggerFactory.getLogger(ServiceLogImpl.class);

	
	public boolean addUser(Instance user) {
		if(user != null && checkAge(user.getAge()) && checkEmail(user.getEmail()) && checkName(user.getName()))
		{
			return list.add(user);
		}else
		{
			log.error("Transaction Failed");
			return false;
		}
	}

	public boolean checkEmail(String email) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(email).matches())
			return true;
		else {
			String error = "Incorrect Email : "+email;
			log.error(error);
			return false;
		}
	}

	public boolean checkAge(int age) 
	{	
		if (age > 0 && age <= 100) {
			return true;
		}
		else {
			String error = "Incorrect Input 1-100 : "+age;
			log.error(error);
			return false;
		}
	}

	public boolean checkName(String name) {
		String regex = "^[aA-zZ ]{5,29}$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(name).matches())
			return true;
		else {
			String error = "Struture Rejected : "+name;
			log.error(error);
			return false;
		}
	}

}
