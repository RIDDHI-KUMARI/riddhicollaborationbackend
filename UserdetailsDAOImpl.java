package com.niit.backendDAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.backendEntity.Userdetails;

@Repository("userdetailsDAO")
@Transactional
public class UserdetailsDAOImpl implements UserdetailsDAO {
	@Autowired
	SessionFactory sessionFactory;
@Transactional
	public void saveorUpdate(Userdetails userdetails) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(userdetails);
	}
@Transactional
	public void editUser(Userdetails userdetails) {
		// TODO Auto-generated method stub
		
	}

@Transactional
		public List<Userdetails> listAllUserdetails() {
		// TODO Auto-generated method stub
	String hql="from Userdetails";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	List<Userdetails> listUserdetails=query.getResultList();
	return listUserdetails;
}

@Transactional
public Userdetails get(String id) {
	// TODO Auto-generated method stub
	String hql = "from Userdetails where id=" + "'" + id + "'";
	Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
	List<Userdetails> listUserdetails = (List<Userdetails>) query.getResultList();
	if (listUserdetails  != null && !listUserdetails .isEmpty()) {
		return listUserdetails.get(0);
	}
	return null;
}
	
	
@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
	Userdetails userdetailsToDelete = new Userdetails();
	userdetailsToDelete.setId(id);
	sessionFactory.getCurrentSession().delete(userdetailsToDelete);

}
@Override
public void edit(Userdetails userdetails) {
	// TODO Auto-generated method stub
	
}
@Override
public Userdetails FindById(String id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void deleteUserdetails(String id) {
	// TODO Auto-generated method stub
	
}
}
