package com.niit.backendDAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.backendEntity.Friends;

@Repository("friendsDAO")
@Transactional
public class FriendsDAOImpl implements FriendsDAO {
	@Autowired
	SessionFactory sessionFactory;
@Transactional
	public void saveorUpdate(Friends friends) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(friends);
	}
@Transactional
	public void editFriends(Friends friends) {
		// TODO Auto-generated method stub
		
	}

@Transactional
		public List<Friends> listAllFriends() {
		// TODO Auto-generated method stub
	String hql="from Friends";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	List<Friends> listUser=query.getResultList();
	return listAllFriends();
}
@Transactional
public List<Friends> get(String User_id) {
	// TODO Auto-generated method stub
	String hql = "from Friends where User_id=" + "'" + User_id + "'" ;
	Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
	List<Friends> listFriends = (List<Friends>) query.list();
	
	return list();
}

@Transactional
public Friends get(String User_id, String Friend_id) {
	// TODO Auto-generated method stub
	String hql = "from Friends where User_id=" + "'" + User_id + "'" and Friend_id=" + "'" + Friend_id + "'";
	Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
	List<Friends> listFriends = (List<Friends>) query.getResultList();
	if (listFriends  != null && !listFriends .isEmpty()) {
		return listFriends.get(0);
	}
	return null;
}
	
	
@Transactional
	public void delete(String User_id,String Friend_id) {
		// TODO Auto-generated method stub
	Friends friends = new Friends();
	Friends.setUser_id(User_id);
	Friends.setFriend_id(Friend_id);
	sessionFactory.getCurrentSession().delete(friends);

}
@Override
public List<Friends> list() {
	// TODO Auto-generated method stub
	return null;
}
}
