package com.au.junit.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.au.junit.instance.Instance;

@RunWith(SpringRunner.class)
public class ServiceTest {
	
	
	  @InjectMocks
	  TestEntry testEntry;
		

	  
	  @Test
	  public void adduser()
	  {
		Instance user = new Instance();
		user.setName("Aryan");
		user.setEmail("Dixit1007@gmail.com");
		user.setAge(25);
		user.setCity("bangalore");
		Assert.assertEquals(true, testEntry.addUser(user));
	  }
	  
	  @Test
	  public void addUserNull()
	  {
		  Instance user = null;
		  Assert.assertEquals(false,testEntry.addUser(user));
	  }	

	  @Test
	  public void checkAgeValid()
	  {
		  int age = 25;	  
		  Assert.assertEquals(true,testEntry.checkAge(age));
	  }

	  @Test
	  public void checkAgeMinimumBoundaryInvalid()
	  {
		  int age = 0;	  
		  Assert.assertEquals(false,testEntry.checkAge(age));
	  }

	  @Test
	  public void checkAgeMinimumBoundaryValid()
	  {
		  int age = 1;	  
		  Assert.assertEquals(true,testEntry.checkAge(age));
	  }

	  @Test
	  public void checkAgeMaxBoundaryInValid()
	  {
		  int age = 110;	  
		  Assert.assertEquals(false,testEntry.checkAge(age));
	  }
	  
	  @Test
	  public void checkAgeMaxBoundaryValid()
	  {
		  int age = 100;	  
		  Assert.assertEquals(true,testEntry.checkAge(age));
	  }
	  
	  @Test
	  public void checkNameValid()
	  {
		  String name = "Aryan";
		  Assert.assertEquals(true,testEntry.checkName(name));
	  }	 
	  
	  @Test
	  public void checkNameValidWithSpace()
	  {
		  String name = "Aryan Dixit";
		  Assert.assertEquals(true,testEntry.checkName(name));
	  }	  
	  
	  @Test
	  public void checkNameInValidWithSpecialCharacter()
	  {
		  String name = "Aryan@Dixit";
		  Assert.assertEquals(false,testEntry.checkName(name));
	  }
	  
	  @Test
	  public void checkEmailValid()
	  {
		  String email = "dixit1007@gmail.com";
		  Assert.assertEquals(true,testEntry.checkEmail(email));
	  }

	  @Test
	  public void checkEmailInValid()
	  {
		  String email = ".dixit1007@gmail.com";
		  Assert.assertEquals(false,testEntry.checkEmail(email));
	  }
	  

	  
	  
	  
}