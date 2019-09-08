package com.org.TestCases;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import com.org.TO.AgentTO;


/** This class contains one testXXXX method per XXXXX method in source class
* @author 
**/
//TODO Add Junit jar in build path.
//TODO Modify input and output data if needed.


public class AgentTOTest extends TestCase {
	

	@Test //public String getState()
	public void testGetState(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setState("7GUHD66z3S6tH");
		String e0 = e0Obj.getState();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "7GUHD66z3S6tH");
	}
	

	@Test //public void setState(String)
	public void testSetState(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setState("7GUHD66z3S6tH");
	}
	

	@Test //public void setMobileNo(String)
	public void testSetMobileNo(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setMobileNo("GeMQS");
	}
	

	@Test //public String getMobileNo()
	public void testGetMobileNo(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setMobileNo("GeMQS");
		String e0 = e0Obj.getMobileNo();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "GeMQS");
	}
	

	@Test //public String getZipcode()
	public void testGetZipcode(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setZipcode("ohZlrz0XT59HLZmtRGd");
		String e0 = e0Obj.getZipcode();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "ohZlrz0XT59HLZmtRGd");
	}
	

	@Test //public void setAgentName(String)
	public void testSetAgentName(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setAgentName("4hSa5b9R7T2nUv");
		String e0 = e0Obj.getAgentName();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "4hSa5b9R7T2nUv");
	}
	

	@Test //public String getAgentId()
	public void testGetAgentId(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setAgentId("Z");
		String e0 = e0Obj.getAgentId();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "Z");
	}
	

	@Test //public void setZipcode(String)
	public void testSetZipcode(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setZipcode("ohZlrz0XT59HLZmtRGd");
	}
	

	@Test //public String getStreetAddress()
	public void testGetStreetAddress(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setStreetAddress("vgQWuw");
		String e0 = e0Obj.getStreetAddress();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "vgQWuw");
	}
	

	@Test //public void setAgentId(String)
	public void testSetAgentId(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setAgentId("Z");
	}
	

	@Test //public String getAgentName()
	public void testGetAgentName(){
		AgentTO asas = new AgentTO();
		asas.setAgentName("afasd");
		String e0 = asas.getAgentName();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "afasd");
	}
	

	@Test //public void setStreetAddress(String)
	public void testSetStreetAddress(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setStreetAddress("vgQWuw");
	}
	

	@Test //public String getCity()
	public void testGetCity(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setCity("cCkOtXHG");
		String e0 = e0Obj.getCity();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "cCkOtXHG");
	}
	

	@Test //public void setCity(String)
	public void testSetCity(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setCity("cCkOtXHG");
	}
	

	@Test
	public void testSequence(){
		AgentTO e0Obj = new AgentTO();
		e0Obj.setState("xMoDSm6A5aT6rwj");
		String e0 = e0Obj.getState();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "xMoDSm6A5aT6rwj");
		
		e0Obj.setMobileNo("yxJbLeG");
		String e3 = e0Obj.getMobileNo();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e3, "yxJbLeG");
		e0Obj.setZipcode("RIoCHqH");
		String e4 = e0Obj.getZipcode();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e4, "RIoCHqH");
		e0Obj.setAgentId("4BjQb");
		String e6 = e0Obj.getAgentId();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e6, "4BjQb");
		e0Obj.setStreetAddress("");
		String e8 = e0Obj.getStreetAddress();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e8, "");
		
		e0Obj.setAgentName("4hSa5b9R7T2nUv");
		String e10 = e0Obj.getAgentName();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e10, "4hSa5b9R7T2nUv");
		e0Obj.setCity("FwGl");
		String e12 = e0Obj.getCity();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e12, "FwGl");
		
	}
	

}
