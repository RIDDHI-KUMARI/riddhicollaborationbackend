package com.niit.backendDAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendEntity.PostComment;


	@Repository("postcommentDAO")
	@Transactional
	public class PostCommentDAOImpl implements PostCommentDAO {
		@Autowired
		SessionFactory sessionFactory;

		public void saveorupdate(PostComment postcomment) {
			// TODO Auto-generated method stub
			sessionFactory.getCurrentSession().saveOrUpdate(postcomment);
		}
		@Transactional
		public void editPostComment(PostComment postcomment) {
			// TODO Auto-generated method stub

		}

		
	@Transactional
		public List<PostComment> listAllComments() {
			// TODO Auto-generated method stub
			String hql = "from PostComment";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			List<PostComment> listPostComment=query.getResultList();
			return listPostComment;
		}
	@Transactional
	public PostComment getById(String id) {
		// TODO Auto-generated method stub
		String hql = "from PostComment where id=" + "'" + id + "'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<PostComment> listPostComment= (List<PostComment>) query.getResultList();
		if (listPostComment!= null && !listPostComment.isEmpty()) {
			return listPostComment.get(0);
		}
		return null;
	}
	@Transactional
		public void deletePostCommentsById(String id) {
			// TODO Auto-generated method stub
		PostComment postcommentToDelete = new PostComment();
		postcommentToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(postcommentToDelete);

		}
	@Override
	public void saveorUpdate(PostComment postcomment) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void edit(PostComment postcomment) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public PostComment get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PostComment> listAllPostComment() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PostComment FindById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deletePostComment(String id) {
		// TODO Auto-generated method stub
		
	}
	}

		


