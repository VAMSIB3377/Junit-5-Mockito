package in.nit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMessage 
{
	@Test
	public void testA()
	{
		String expected = "HELLo";
		String actual = "HELLO";
		assertEquals(expected, actual,"May be Values Are Not Similar");
	}
}
