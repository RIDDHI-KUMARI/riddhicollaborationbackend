package com.niit.backendDAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendEntity.Blog;
import com.niit.backendEntity.BlogComment;
import com.niit.backendEntity.Forum;
import com.niit.backendEntity.ForumPost;

@Repository("forumpostDAO")
@Transactional
public class ForumPostDAOImpl implements ForumDAO {
@Autowired
SessionFactory sessionFactory;
@Transactional
public void saveorUpdate(ForumPost forumpost){
	sessionFactory.getCurrentSession().saveOrUpdate(forumpost);
}
@Transactional
public void edit(ForumPost forumpost){
}
@Transactional
public List<ForumPost> listAllForumPost(){
	String hql = "from ForumPost";
	Query query =sessionFactory.getCurrentSession().createQuery(hql);
	List<ForumPost> listForumPost=query.getResultList();
	return listForumPost;
}
@Transactional
public ForumPost findById(String id){
	// TODO Auto-generated method stub
			String hql = "from Forum where id=" + "'" + id + "'";
			Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
			List<ForumPost> listForumPost = (List<ForumPost>) query.getResultList();
			if (listForumPost  != null && !listForumPost .isEmpty()) {
				return listForumPost.get(0);
			}
			return null;
		}
@Transactional
public void deleteForumPostById(String id) {
	// TODO Auto-generated method stub
ForumPost forumpostToDelete = new ForumPost();
forumpostToDelete.setId(id);
sessionFactory.getCurrentSession().delete(forumpostToDelete);

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
public List<Forum> listAllForums() {
	// TODO Auto-generated method stub
	return null;
}
public List<Forum> listSingleForum() {
	// TODO Auto-generated method stub
	return null;
}
public Forum FindByTitle(String title) {
	// TODO Auto-generated method stub
	return null;
}
public boolean isForumExist(Forum forum) {
	// TODO Auto-generated method stub
	return false;
}
public Forum FindById(String id) {
	// TODO Auto-generated method stub
	return null;
}
public void deleteForumById(String id) {
	// TODO Auto-generated method stub
	
}
}
