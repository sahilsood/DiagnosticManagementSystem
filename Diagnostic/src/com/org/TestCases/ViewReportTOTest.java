package com.org.TestCases;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import com.org.TO.ViewReportTO;


/** This class contains one testXXXX method per XXXXX method in source class
* @author 
**/
//TODO Add Junit jar in build path.
//TODO Modify input and output data if needed.


public class ViewReportTOTest extends TestCase {
	

	@Test //public String getResult()
	public void testGetResult(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setResult("erO4os2SB");
		String e0 = e0Obj.getResult();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "erO4os2SB");
	}
	

	@Test //public void setResult(String)
	public void testSetResult(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setResult("erO4os2SB");
	}
	

	@Test //public String getUsername()
	public void testGetUsername(){
	}
	

	@Test //public void setUsername(String)
	public void testSetUsername(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setUsername("fJIixOQaC");
	}
	

	@Test //public void setDiagnosis(String)
	public void testSetDiagnosis(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setDiagnosis("USDoKk50");
	}
	

	@Test //public String getDoctorname()
	public void testGetDoctorname(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setDoctorname("JuUjCL");
		String e0 = e0Obj.getDoctorname();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "JuUjCL");
	}
	

	@Test //public String getDiagnosis()
	public void testGetDiagnosis(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setDiagnosis("USDoKk50");
		String e0 = e0Obj.getDiagnosis();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "USDoKk50");
	}
	

	@Test //public void setMobileNo(String)
	public void testSetMobileNo(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setMobileNo("");
	}
	

	@Test //public String getReportId()
	public void testGetReportId(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setReportId("NSOjOrniH1mXY4cJe");
		String e0 = e0Obj.getReportId();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "NSOjOrniH1mXY4cJe");
	}
	

	@Test //public void setReportId(String)
	public void testSetReportId(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setReportId("NSOjOrniH1mXY4cJe");
	}
	

	@Test //public String getMobileNo()
	public void testGetMobileNo(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setMobileNo("");
		String e0 = e0Obj.getMobileNo();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "");
	}
	

	@Test //public void setDoctorname(String)
	public void testSetDoctorname(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setDoctorname("JuUjCL");
	}
	

	@Test //public String getEmail()
	public void testGetEmail(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setEmail("RBb6a");
		String e0 = e0Obj.getEmail();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "RBb6a");
	}
	

	@Test //public void setEmail(String)
	public void testSetEmail(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setEmail("RBb6a");
	}
	

	@Test //public String getDob()
	public void testGetDob(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setDob("zB0v");
		String e0 = e0Obj.getDob();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "zB0v");
	}
	

	@Test //public void setDob(String)
	public void testSetDob(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setDob("zB0v");
	}
	

	@Test
	public void testSequence(){
		ViewReportTO e0Obj = new ViewReportTO();
		e0Obj.setResult("BnUnFGuxGhg");
		String e0 = e0Obj.getResult();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e0, "BnUnFGuxGhg");
		
		e0Obj.setUsername("r");
		String e2 = e0Obj.getUsername();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e2, "r");
		
		
		e0Obj.setDoctorname("qJ0zKxo");
		String e5 = e0Obj.getDoctorname();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e5, "qJ0zKxo");
		e0Obj.setDiagnosis("ui5XOBQv");
		String e6 = e0Obj.getDiagnosis();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e6, "ui5XOBQv");
		
		e0Obj.setReportId("Prhg");
		String e8 = e0Obj.getReportId();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e8, "Prhg");
		e0Obj.setMobileNo("nzomAtw7piq5cHPrJaS");
		String e10 = e0Obj.getMobileNo();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e10, "nzomAtw7piq5cHPrJaS");
		e0Obj.setEmail("52CGDz");
		String e12 = e0Obj.getEmail();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e12, "52CGDz");
		e0Obj.setDob("UdlUiKbokis0cSIfR");
		String e14 = e0Obj.getDob();
		//TODO Based on your need, provide necessary assertion condition
		assertEquals(e14, "UdlUiKbokis0cSIfR");
		
	}
	

}
