package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.BlogComment;

public interface BlogCommentDAO {
	void saveorupdate(BlogComment blogcomment);

	BlogComment getById(String id);

	List<BlogComment> listAllComments();

	void deleteBlogCommentsById(String id);
}
