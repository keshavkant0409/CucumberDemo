package Utilities;

import org.junit.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

	
	
	@Before
	public void start() {
		
		System.out.println("####################before start#################");
	}
	

	
	@After
public void end() {
		
		System.out.println("####################after end#################");
	}
	
	
}
