package com.au.junit.service;

import org.springframework.stereotype.Service;

import com.au.junit.instance.Instance;

@Service
public interface ServiceLog {
	   public boolean addUser(Instance user);
	   public boolean checkEmail(String email);
	   public boolean checkAge(int age);
	   public boolean checkName(String name);
}
