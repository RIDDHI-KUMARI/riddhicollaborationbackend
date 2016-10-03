package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.ForumPost;

public interface ForumPostDAO {
void saveorUpdate(ForumPost forumpost);
void edit(ForumPost forumpost);
ForumPost get(String id);
List<ForumPost> listAllForumPost();
ForumPost FindById(String id);
void deleteForumPost(String id);
}
