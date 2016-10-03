package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.Forum;

public interface ForumDAO {
	void saveorUpdate(Forum forum);
	void edit(Forum forum);
	Forum get (String id);
	List<Forum> listAllForums();
	List<Forum> listSingleForum();
	public Forum FindByTitle(String title);
	boolean isForumExist(Forum forum);
	Forum FindById(String id);
	void deleteForumById(String id);
	
	

}
