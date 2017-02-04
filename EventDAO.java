package com.AitWeb.DataAccess;

import com.AitWeb.jdbc.Util.AitMysqlCon;

public class EventDAO {
	
	
	String AitDbName = EventsConstants.QUERY_DB_EVENT_TABLE_NAME;
	
	AitMysqlCon con = new AitMysqlCon(AitDbName);
}
