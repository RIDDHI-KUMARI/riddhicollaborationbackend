package com.niit.backendDAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendDAO.ForumDAO;
import com.niit.backendEntity.Event;
import com.niit.backendEntity.Forum;
@Repository("forumDAO")
@Transactional
public class ForumDAOImpl implements ForumDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public void saveOrUpdate(Forum forum) {
		// TODO Auto-generated method stub
      sessionFactory.getCurrentSession().saveOrUpdate(forum);
	}

	@Transactional
	public List<Forum> listAllForums() {
		// TODO Auto-generated method stub
		String hql="from Forum";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Forum> listForum=query.getResultList();
		return listForum;
	}

	@Transactional
	public Forum FindByTitle(String title) {
		// TODO Auto-generated method stub
		String hql = "from Forum where title=" + "'" + title + "'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Forum> listForum = (List<Forum>) query.getResultList();
		if (listForum  != null && !listForum .isEmpty()) {
			return listForum.get(0);
		}
		return null;
	}

	@Transactional
	public boolean isForumExist(Forum forum) {
		// TODO Auto-generated method stub
		return FindByTitle(forum.getTitle())!=null;
	}

	@Transactional
	public Forum FindById(String id) {
		// TODO Auto-generated method stub
		String hql = "from Forum where forum_id=" + "'" + id + "'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Forum> listForum = (List<Forum>) query.getResultList();
		if (listForum  != null && !listForum .isEmpty()) {
			return listForum.get(0);
		}
		return null;
	}

	@Transactional
	public void deleteForumById(String id) {
		// TODO Auto-generated method stub
		Forum forumToDelete = new Forum();
		forumToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(forumToDelete);
	}

	public void saveorUpdate(Forum forum) {
		// TODO Auto-generated method stub
		
	}

	public void edit(Forum forum) {
		// TODO Auto-generated method stub
		
	}

	public Forum get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Forum> listSingleForum() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAllForumsById(String id) {
		// TODO Auto-generated method stub
		
	}

}