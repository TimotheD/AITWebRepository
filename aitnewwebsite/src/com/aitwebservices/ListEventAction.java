package com.AitWebServices;

import com.AitWebPojo.Event;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Result(location = "list-people.ftl", type = "freemarker")
public class ListEventAction extends ActionSupport {



		private static final long serialVersionUID = 3608017189783645371L;

		@Autowired
		private EventManager eventmanager1;

		private List<Event> event = new ArrayList<Event>();

		public String execute() {
			event.addAll(EventManager.getEvents());

			return SUCCESS;
		}

		public List<Event> getEvents() {
			return event;
		}

		public int getEventCount() {
			return event.size();
		}

	}

