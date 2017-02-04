package com.AitWeb.Action;

import com.AitWeb.jdbc.Util.DbConnection;
import com.AitWebServices.AitGetEvents;

public class EventAction{
   private String sbEvent;


   public String getEvent() {
		return sbEvent;
	}

	public void setEvents(String sbEvent) {
		this.sbEvent = sbEvent;
	}

	public String execute() throws Exception {
	   System.out.println("It worked");
	   DbConnection dbconnection = new DbConnection();
	   dbconnection.getAitEvents(sbEvent);
	   System.out.println(sbEvent);
	 

      return "success";
   }




}