package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.ForumPost;
import com.niit.backendEntity.PostComment;

public interface PostCommentDAO {
void saveorUpdate(PostComment postcomment);
void edit(PostComment postcomment);
PostComment get(String id);
List<PostComment> listAllPostComment();
PostComment FindById(String id);
void deletePostComment(String id);
}
