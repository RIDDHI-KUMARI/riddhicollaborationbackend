package com.niit.backendDAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendDAO.BlogDAO;
import com.niit.backendEntity.Blog;
import com.niit.backendEntity.Event;
@Repository("blogDao")
@Transactional
public class BlogDAOImpl implements BlogDAO {
@Autowired
SessionFactory sessionFactory;

	@Transactional
	public void saveOrUpdate(Blog blog) {
		// TODO Auto-generated method stub
        sessionFactory.getCurrentSession().saveOrUpdate(blog);
	}

	@Transactional
	public void editBlog(Blog blog) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public Blog get(String blog_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Blog> listAllBlog() {
		// TODO Auto-generated method stub
		/*@SuppressWarnings("unchecked")
		
		List<Blog> listBlog  = (List<Blog>) sessionFactory.getCurrentSession()
		.createCriteria(Blog.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listBlog;*/
		String hql="from Blog";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Blog> listBlog=query.getResultList();
		return listBlog;
	}

	@Transactional
	public Blog findByTitle(String title) {
		// TODO Auto-generated method stub
		String hql = "from Blog where title=" + "'" + title + "'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Blog> listBlog = (List<Blog>) query.getResultList();
		if (listBlog  != null && !listBlog .isEmpty()) {
			return listBlog.get(0);
		}
		return null;
	}

	@Transactional
	public boolean isBlogExist(Blog blog) {
		// TODO Auto-generated method stub
		return findByTitle(blog.getTitle())!=null;
	}

	@Transactional
	public Blog findById(String id) {
		// TODO Auto-generated method stub
		String hql = "from Blog where id=" + "'" + id + "'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Blog> listBlog= (List<Blog>) query.getResultList();
		if (listBlog!= null && !listBlog.isEmpty()) {
			return listBlog.get(0);
		}
		return null;
	}

	@Transactional
	public void deleteBlogById(String id) {
		// TODO Auto-generated method stub
		Blog blogToDelete = new Blog();
		blogToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(blogToDelete);
	}

	@Transactional
	public void deleteAllBlogs() {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getClass());
	}

	public void saveorupdate(Blog blog) {
		// TODO Auto-generated method stub
		
	}

	public Blog FindByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	public Blog FindById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
