package com.tu.TestApplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {
	
	public void Show() {
		System.out.println("show method");
	}

}
