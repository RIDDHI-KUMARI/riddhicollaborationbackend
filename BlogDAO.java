package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.Blog;

public interface BlogDAO {
	void saveorupdate(Blog blog);

	void editBlog(Blog blog);

	Blog get(String id);

	List<Blog> listAllBlog();

	public Blog FindByTitle(String title);

	boolean isBlogExist(Blog blog);

	Blog FindById(String id);

	void deleteBlogById(String id);

	void deleteAllBlogs();

}
