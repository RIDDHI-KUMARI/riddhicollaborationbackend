package com.niit.backendDAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendDAO.EventDAO;
import com.niit.backendEntity.Blog;
import com.niit.backendEntity.Event;
@Repository("eventDao")
@Transactional
public class EventDAOImpl implements EventDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public void saveOrUpdate(Event event) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().saveOrUpdate(event);
	}


	@Transactional
	public List<Event> listAllEvent() {
		// TODO Auto-generated method stub
		/*@SuppressWarnings("unchecked")
		
		List<Blog> listBlog  = (List<Blog>) sessionFactory.getCurrentSession()
		.createCriteria(Blog.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listBlog;*/
		String hql="from Event";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Event> listEvent=query.getResultList();
		return listEvent;
	}
	@Transactional
	public Event findByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Event where name=" + "'" + name + "'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Event> listEvent = (List<Event>) query.getResultList();
		if (listEvent  != null && !listEvent .isEmpty()) {
			return listEvent.get(0);
		}
		return null;
	}
	@Transactional
	public boolean isEventExist(Event event) {
		// TODO Auto-generated method stub
		
		return FindByName(event.getName())!=null;
	}
	

	@Transactional
	public Event findById(String id) {
		// TODO Auto-generated method stub
		String hql = "from Event where id=" + "'" + id + "'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Event> listEvent= (List<Event>) query.getResultList();
		if (listEvent!= null && !listEvent.isEmpty()) {
			return listEvent.get(0);
		}
		return null;
	}
	
	@Transactional
	public void deleteUserById(String id) {
		// TODO Auto-generated method stub
		Event eventToDelete = new Event();
		eventToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(eventToDelete);
		
	}

	@Transactional
	public void deleteAllEvents() {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getClass());
	}


	public void saveorupdate(antlr.debug.Event event) {
		// TODO Auto-generated method stub
		
	}


	public antlr.debug.Event FindByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean isEventExist(antlr.debug.Event event) {
		// TODO Auto-generated method stub
		return false;
	}


	public antlr.debug.Event FindById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<antlr.debug.Event> listAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}
}


	