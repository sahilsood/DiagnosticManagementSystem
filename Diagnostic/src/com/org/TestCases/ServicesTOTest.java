package com.org.TestCases;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import com.org.TO.ServicesTO;


/** This class contains one testXXXX method per XXXXX method in source class
* @author 
**/
//TODO Add Junit jar in build path.
//TODO Modify input and output data if needed.


public class ServicesTOTest extends TestCase {
	

	@Test //public String getServiceName()
	public void testGetServiceName(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceName("ujCWfvJONok");
		String e0 = e0Obj.getServiceName();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "ujCWfvJONok");
	}
	

	@Test //public String getServiceBenefits()
	public void testGetServiceBenefits(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceBenefits("vx");
		String e0 = e0Obj.getServiceBenefits();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "vx");
	}
	

	@Test //public void setServiceFeatures(String)
	public void testSetServiceFeatures(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceFeatures("BCDwYQHXPGIn");
	}
	

	@Test //public void setServiceBenefits(String)
	public void testSetServiceBenefits(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceBenefits("vx");
	}
	

	@Test //public void setServiceParameters(String)
	public void testSetServiceParameters(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceParameters("oWrC9Yxl9");
	}
	

	@Test //public String getServiceFeatures()
	public void testGetServiceFeatures(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceFeatures("BCDwYQHXPGIn");
		String e0 = e0Obj.getServiceFeatures();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "BCDwYQHXPGIn");
	}
	

	@Test //public String getServiceParameters()
	public void testGetServiceParameters(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceParameters("oWrC9Yxl9");
		String e0 = e0Obj.getServiceParameters();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "oWrC9Yxl9");
	}
	

	@Test //public int getServiceId()
	public void testGetServiceId(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceId(-74);
		int e0 = e0Obj.getServiceId();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, -74);
	}
	

	@Test //public void setServiceId(int)
	public void testSetServiceId(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceId(-74);
	}
	

	@Test //public void setServiceName(String)
	public void testSetServiceName(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceName("ujCWfvJONok");
	}
	

	@Test
	public void testSequence(){
		ServicesTO e0Obj = new ServicesTO();
		e0Obj.setServiceName("QVSFHV");
		String e0 = e0Obj.getServiceName();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "QVSFHV");
		e0Obj.setServiceBenefits("tOcSM3QPxHJr5");
		String e1 = e0Obj.getServiceBenefits();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e1, "tOcSM3QPxHJr5");
		
		
		
		e0Obj.setServiceFeatures("7Ntnsf");
		String e5 = e0Obj.getServiceFeatures();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e5, "7Ntnsf");
		e0Obj.setServiceParameters("ugcOy7dirc7");
		String e6 = e0Obj.getServiceParameters();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e6, "ugcOy7dirc7");
		e0Obj.setServiceId(10);
		int e7 = e0Obj.getServiceId();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e7, 10);
		
		
	}
	

}
