package com.niit.backendDAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendEntity.Blog;
import com.niit.backendEntity.BlogComment;

@Repository("blogcommentDAO")
@Transactional
public class BlogCommentDAOImpl implements BlogCommentDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void saveorupdate(BlogComment blogcomment) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(blogcomment);
	}
	@Transactional
	public void editBlog(BlogComment blogcomment) {
		// TODO Auto-generated method stub

	}

	
@Transactional
	public List<BlogComment> listAllComments() {
		// TODO Auto-generated method stub
		String hql = "from BlogComment";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<BlogComment> listBlogComment=query.getResultList();
		return listBlogComment;
	}
@Transactional
public BlogComment getById(String id) {
	// TODO Auto-generated method stub
	String hql = "from BlogComment where id=" + "'" + id + "'";
	Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
	List<BlogComment> listBlogComment= (List<BlogComment>) query.getResultList();
	if (listBlogComment!= null && !listBlogComment.isEmpty()) {
		return listBlogComment.get(0);
	}
	return null;
}
@Transactional
	public void deleteBlogCommentsById(String id) {
		// TODO Auto-generated method stub
	BlogComment blogcommentToDelete = new BlogComment();
	blogcommentToDelete.setId(id);
	sessionFactory.getCurrentSession().delete(blogcommentToDelete);

	}
}

	