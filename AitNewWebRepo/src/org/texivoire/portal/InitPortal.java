package org.texivoire.portal;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import java.text.*;

public class InitPortal extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date today = Calendar.getInstance().getTime();        
	private String currentDate = dateFormat.format(today);
	

	public String execute() throws Exception {
		getCurrentDate();
        return "";
    }
    
    public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}


}
