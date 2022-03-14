package in.nit.util;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestDB_Connection 
{
	
	public DB_Connection dbc;
	private Connection con;
	
	
	@BeforeEach
	public void initData()
	{
		dbc = new DB_Connection();	
	}
	
	
	
	@Test
	public void testGetCon()
	{
		
		//Expected con is not a null
		assertDoesNotThrow(()->
		{
			con = dbc.getCon();
		});
	  	assertNotNull(con,"Connection is Not Created, Please Check");
	}
	
	
	@AfterEach
	public void clean()
	{
		dbc = null;
		con = null;
	}
	
}