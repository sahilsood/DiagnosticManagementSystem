package com.org.TestCases;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import com.org.TO.HealthPlanTO;


/** This class contains one testXXXX method per XXXXX method in source class
* @author 
**/
//TODO Add Junit jar in build path.
//TODO Modify input and output data if needed.


public class HealthPlanTOTest extends TestCase {
	

	@Test //public String getPlanDays()
	public void testGetPlanDays(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanDays("yptFr98a8Btekf");
		String e0 = e0Obj.getPlanDays();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "yptFr98a8Btekf");
	}
	

	@Test //public String getPlanName()
	public void testGetPlanName(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanName("y1izq3h10sjEMX7");
		String e0 = e0Obj.getPlanName();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "y1izq3h10sjEMX7");
	}
	

	@Test //public void setPlanDetails(String)
	public void testSetPlanDetails(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanDetails("HVcxZ7pxFAlUa4");
	}
	

	@Test //public void setPlanId(int)
	public void testSetPlanId(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanId(4);
	}
	

	@Test //public int getPlanId()
	public void testGetPlanId(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanId(4);
		int e0 = e0Obj.getPlanId();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, 4);
	}
	

	@Test //public void setPlanName(String)
	public void testSetPlanName(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanName("y1izq3h10sjEMX7");
	}
	

	@Test //public void setPlanDays(String)
	public void testSetPlanDays(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanDays("yptFr98a8Btekf");
	}
	

	@Test //public String getPlanDetails()
	public void testGetPlanDetails(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanDetails("HVcxZ7pxFAlUa4");
		String e0 = e0Obj.getPlanDetails();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "HVcxZ7pxFAlUa4");
	}
	

	@Test //public String getPrice()
	public void testGetPrice(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPrice("NlKQxb");
		String e0 = e0Obj.getPrice();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "NlKQxb");
	}
	

	@Test //public void setPrice(String)
	public void testSetPrice(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPrice("NlKQxb");
	}
	

	@Test
	public void testSequence(){
		HealthPlanTO e0Obj = new HealthPlanTO();
		e0Obj.setPlanDays("yFM25");
		String e0 = e0Obj.getPlanDays();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "yFM25");
		e0Obj.setPlanName("w4YKDn3s82xwTgY6O");
		String e1 = e0Obj.getPlanName();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e1, "w4YKDn3s82xwTgY6O");
		
		e0Obj.setPlanId(90);
		int e4 = e0Obj.getPlanId();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e4, 90);
		
		e0Obj.setPlanDetails("9sBGZ");
		String e7 = e0Obj.getPlanDetails();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e7, "9sBGZ");
		e0Obj.setPrice("uq6XwSACK77jvm");
		String e8 = e0Obj.getPrice();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e8, "uq6XwSACK77jvm");
		
	}
	

}
