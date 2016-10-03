package com.niit.backendDAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendEntity.Blog;
import com.niit.backendEntity.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
@Transactional
	public void saveorUpdate(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
@Transactional
	public void editUser(User user) {
		// TODO Auto-generated method stub
		
	}

@Transactional
		public List<User> listAllUser() {
		// TODO Auto-generated method stub
	String hql="from User";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	List<User> listUser=query.getResultList();
	return listUser;
}

@Transactional
public User get(String id) {
	// TODO Auto-generated method stub
	String hql = "from User where id=" + "'" + id + "'";
	Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
	List<User> listUser = (List<User>) query.getResultList();
	if (listUser  != null && !listUser .isEmpty()) {
		return listUser.get(0);
	}
	return null;
}
	
	
@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
	User userToDelete = new User();
	userToDelete.setId(id);
	sessionFactory.getCurrentSession().delete(userToDelete);

}
}
