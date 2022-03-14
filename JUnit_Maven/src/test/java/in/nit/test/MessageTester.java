package in.nit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import in.init.service.Message;

public class MessageTester 
{
	private Message m;
	private String expected;
	private String actual;
	
	
	//provide init-data
	@BeforeEach
	public void setup()
	{
		 m = new Message();
		 expected = "Welcome to :Vamsi";
		 actual = "";
	}
	
	
	//Do Unit test.
	@Test
	public void testShowMsg()
	{
		
		
		actual = m.showMsg("Vamsi");
		assertEquals(actual,expected);
	}
	
	
	
	//clear memory /clear memory.
	@AfterEach
	public void clean()
	{
		m = null;
		expected = actual = null;
	}
	
	
	
	
}
