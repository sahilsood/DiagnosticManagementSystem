/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.org.TO.AgentTO;
import com.org.TO.HealthPlanTO;
import com.org.TO.ServicesTO;
import com.org.TO.UsermasterTO;
import com.org.TO.ViewReportTO;
import com.org.util.ConnectDB;

/**
 *
 * @author sahilsood
 */
public class UsermasterDAO {

    /**
     *
     * @param un
     * @param pass
     * @return
     */
    public UsermasterTO authUser(String un, String pass) {
        UsermasterTO objBean = null;

        try {
            Connection con = ConnectDB.connect();
            PreparedStatement pstmt = con.prepareStatement("select * from usermaster where username=? and password=binary(?)");
            pstmt.setString(1, un);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();
            

            if (rs.next()) {
                objBean = new UsermasterTO();
                objBean.setUsername(rs.getString("username"));
                objBean.setPassword(rs.getString("password"));
                objBean.setUserType(rs.getString("type"));

            }
        } catch (Exception e) {
            System.out.println("In AuthUser()" + e);
        }
        return objBean;
    }

    /**
     *
     * @param oldPassword
     * @param newPassword
     * @param userId
     * @return
     */
    


    public List<ServicesTO> getAllServices(String service) {
        List<ServicesTO> lstServ = new ArrayList<ServicesTO>();
        
        try {
        	Connection con = ConnectDB.connect();
            PreparedStatement pstmt = con.prepareStatement("select * from medicareservice_master");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
            	ServicesTO objBean = new ServicesTO();
                objBean.setServiceId(rs.getInt("Service_id"));
                objBean.setServiceName(rs.getString("Service_Name"));
                lstServ.add(objBean);
            }
        } catch (Exception e) {
            System.out.println("In getAllServices():" + e);
        }
        return lstServ;
    }
    
    public List<ServicesTO> getServiceDetailsById(int sid) {
    	List<ServicesTO> lstServ = new ArrayList<ServicesTO>();
        try {
        	Connection con = ConnectDB.connect();
        	PreparedStatement pstmt = con.prepareStatement("select * from medicareservice_master where Service_id=?");
            pstmt.setInt(1, sid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
            	ServicesTO objBean = new ServicesTO();
            	objBean.setServiceId(rs.getInt("Service_id"));
                objBean.setServiceName(rs.getString("Service_Name"));
                objBean.setServiceFeatures(rs.getString("Service_Features"));
                objBean.setServiceBenefits(rs.getString("Service_Benefits"));
                objBean.setServiceParameters(rs.getString("Service_Parameters"));
                lstServ.add(objBean);
            }
        } catch (Exception e) {
            System.out.println("In getServiceDetailsById():" + e);
        }
        return lstServ;
    }

    public List<ViewReportTO> viewReport(String rep) {
    	List<ViewReportTO> lstRep = new ArrayList<ViewReportTO>();
        

        try {
            Connection con = ConnectDB.connect();
            PreparedStatement pstmt = con.prepareStatement("select * from reportdetails where reportId=?");
            pstmt.setString(1, rep);
            ResultSet rs = pstmt.executeQuery();
            ViewReportTO obj1 = new ViewReportTO();
            if (rs.next()) {
                obj1.setReportId(rs.getString("reportId"));
                obj1.setUsername(rs.getString("username"));
                obj1.setEmail(rs.getString("email"));
                obj1.setMobileNo(rs.getString("mobileNo"));
                obj1.setDoctorname(rs.getString("doctorname"));
                obj1.setDiagnosis(rs.getString("diagnosis"));
                obj1.setResult(rs.getString("result"));
                lstRep.add(obj1);
            }

        } catch (Exception e) {
            System.out.println("In viewReport()" + e);
        }
        return lstRep;
    }
    public List<AgentTO> viewAgent(String city) {
    	List<AgentTO> lstAge = new ArrayList<AgentTO>();
        try {
            Connection con = ConnectDB.connect();
            PreparedStatement pstmt = con.prepareStatement("select * from agent_details where City=?");
            pstmt.setString(1, city);
            ResultSet rs = pstmt.executeQuery();
            AgentTO obj1 = new AgentTO();
            if (rs.next()) {
                obj1.setAgentId(rs.getString("Agent_Id"));
                obj1.setAgentName(rs.getString("Agent_Name"));
                obj1.setStreetAddress(rs.getString("Street_Address"));
                obj1.setMobileNo(rs.getString("Mobile_Number"));
                obj1.setCity(rs.getString("City"));
                obj1.setState(rs.getString("State"));
                obj1.setZipcode(rs.getString("Zipcode"));
                lstAge.add(obj1);
            }
        } catch (Exception e) {
            System.out.println("In viewAgent()" + e);
        }
        return lstAge;
    }

    public List<HealthPlanTO> getAllPlans(String plans) {
        List<HealthPlanTO> lstPlan = new ArrayList<HealthPlanTO>();
        
        try {
        	Connection con = ConnectDB.connect();
            PreparedStatement pstmt = con.prepareStatement("select * from health_checkup");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
            	HealthPlanTO objBean = new HealthPlanTO();
                objBean.setPlanId(rs.getInt("HealthPlan_ID"));
                objBean.setPlanName(rs.getString("HealthPlanName"));
                lstPlan.add(objBean);
            }
        } catch (Exception e) {
            System.out.println("In getAllPlans():" + e);
        }
        return lstPlan;
    }
    public List<HealthPlanTO> getPlanDetailsById(int plid) {
    	List<HealthPlanTO> lstPlan = new ArrayList<HealthPlanTO>();
        try {
        	Connection con = ConnectDB.connect();
        	PreparedStatement pstmt = con.prepareStatement("select * from health_checkup where HealthPlan_ID=?");
            pstmt.setInt(1, plid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
            	HealthPlanTO objBean = new HealthPlanTO();
            	objBean.setPlanId(rs.getInt("HealthPlan_ID"));
                objBean.setPlanName(rs.getString("HealthPlanName"));
                objBean.setPlanDetails(rs.getString("HealthPlanDetails"));
                objBean.setPlanDays(rs.getString("CheckupDetails"));
                objBean.setPrice(rs.getString("Price"));
                lstPlan.add(objBean);
            }
        } catch (Exception e) {
            System.out.println("In getPlanDetailsById():" + e);
        }
        return lstPlan;
    }

}
