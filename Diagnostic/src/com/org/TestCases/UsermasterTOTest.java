package com.org.TestCases;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import com.org.TO.UsermasterTO;


/** This class contains one testXXXX method per XXXXX method in source class
* @author 
**/
//TODO Add Junit jar in build path.
//TODO Modify input and output data if needed.


public class UsermasterTOTest extends TestCase {
	

	@Test //public String getPassword()
	public void testGetPassword(){
		UsermasterTO e0Obj = new UsermasterTO();
		e0Obj.setPassword("w4AdguLLWxfIgN5Rmf");
		String e0 = e0Obj.getPassword();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "w4AdguLLWxfIgN5Rmf");
	}
	

	@Test //public void setPassword(String)
	public void testSetPassword(){
		UsermasterTO e0Obj = new UsermasterTO();
		e0Obj.setPassword("w4AdguLLWxfIgN5Rmf");
	}
	

	@Test //public String getUsername()
	public void testGetUsername(){
		UsermasterTO e0Obj = new UsermasterTO();
		e0Obj.setUsername("");
		String e0 = e0Obj.getUsername();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "");
	}
	

	@Test //public void setUsername(String)
	public void testSetUsername(){
		UsermasterTO e0Obj = new UsermasterTO();
		e0Obj.setUsername("");
	}
	

	@Test //public String getUserType()
	public void testGetUserType(){
		UsermasterTO e0Obj = new UsermasterTO();
		e0Obj.setUserType("qTRi2oL4F");
		String e0 = e0Obj.getUserType();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "qTRi2oL4F");
	}
	

	@Test //public void setUserType(String)
	public void testSetUserType(){
		UsermasterTO e0Obj = new UsermasterTO();
		e0Obj.setUserType("qTRi2oL4F");
	}
	

	@Test
	public void testSequence(){
		UsermasterTO e0Obj = new UsermasterTO();
		e0Obj.setPassword("kjh8xDIqfXr0d");
		String e0 = e0Obj.getPassword();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "kjh8xDIqfXr0d");
		
		e0Obj.setUsername("MCREB3rgvMzB");
		String e2 = e0Obj.getUsername();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e2, "MCREB3rgvMzB");
		
		e0Obj.setUserType("99WbWitLJys4");
		String e4 = e0Obj.getUserType();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e4, "99WbWitLJys4");
		
	}
	

}
