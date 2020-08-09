package com.au.junit.mockito;

import static org.junit.Assert.assertEquals;


import static org.mockito.Mockito.*;

import org.junit.Test;

import com.au.junit.service.ServiceLog;
import com.au.junit.service.test.TestEntry;

public class ImplMockito {
	
	TestEntry testentry = new TestEntry();


	ServiceLog servicelog = mock(ServiceLog.class);
    
    
	@Test
	public void MockitoSingleTest()
	{
	   when(servicelog.checkEmail(anyString())).thenReturn(true);
	   assertEquals(true,servicelog.checkEmail("IncorrectInput"));	
	}
	
}