package com.AitWebServices;
import java.util.HashSet;
import java.util.Set;

import com.AitWebPojo.Event;


public class EventManager {

	
		private static Set<Event> event = new HashSet<Event>();
		private static long COUNT ;

		static {
			// create event
			Event e1 = new Event();

			event.add(e1);
						
		}

		public static void createEvent(Event event) {
			event.setId(new Long(++COUNT));
			event.add(event);
		}

		public void updatePerson(Event event) {
			event.add(event);
		}

		public static Set<Event> getEvents() {
			return event;
		}
	}


