package com.AitWebServices;
import com.AitWebPojo.Event;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;


@Results({
		@Result(name = "list", location = "list-people.action", type = "redirect"),
		@Result(name = "input", location = "new-person.ftl", type = "freemarker")
})

public class NewEventAction extends ActionSupport {
	

		private static final long serialVersionUID = 200410824352645515L;

		@Autowired
		private EventManager eventManager;
		private Event event;

		/**
		 * @return the event
		 */
		public Event getEvent() {
			return event;
		}

		/**
		 * @param event the event to set
		 */
		public void setEvent(Event event) {
			this.event = event;
		}

		public String execute() {
			EventManager.createEvent(event);

			return "list";
		}

	}

	
