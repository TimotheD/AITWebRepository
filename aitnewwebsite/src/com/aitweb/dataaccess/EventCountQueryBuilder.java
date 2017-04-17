  package com.AitWeb.DataAccess;



 public class EventCountQueryBuilder{
	 
	 

	 public static String insertEventQuery(){
			StringBuffer AitEventQuery = new StringBuffer();
			AitEventQuery.append(EventsConstants.QUERY_INSERT);
			AitEventQuery.append(EventsConstants.QUERY_INTO);
			AitEventQuery.append(EventsConstants.QUERY_DB_EVENT_TABLE_NAME);
			AitEventQuery.append(EventsConstants.QUERY_SEMICOLON);
			
		
		 return null;
		 
	 }
	
	public static String retrieveEventQuery(){
		
		StringBuffer AitEventQuery = new StringBuffer();
		AitEventQuery.append(EventsConstants.QUERY_SELECT);
		AitEventQuery.append(EventsConstants.QUERY_SELECT_ALL);
		AitEventQuery.append(EventsConstants.QUERY_FROM);
		AitEventQuery.append(EventsConstants.QUERY_DB_EVENT_TABLE_NAME);
		AitEventQuery.append(EventsConstants.QUERY_SEMICOLON);
		
		return AitEventQuery.toString();
	
	}
	public void updateEvent(){
		
		
		
	}

	public void deleteEvent(){
		
		
		
	}
}
