package com.niit.backendDAO;

import java.util.List;

import antlr.debug.Event;

public interface EventDAO {
	void saveorupdate(Event event);

	List<Event> listAllEvents();

	public Event FindByName(String name);

	boolean isEventExist(Event event);

	Event FindById(String id);

	void deleteUserById(String event_id);

	void deleteAllEvents();

}
