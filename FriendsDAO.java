package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.Friends;

public interface FriendsDAO {
	public List<Friends> list();

	public List<Friends> get(String User_id);

	public void saveorUpdate(Friends friends);

	public void delete(String User_id, String Friend_id);

}
