package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.User;

public interface UserDAO {
void saveorUpdate(User user);
void editUser(User user);
User get(String id);
List <User> listAllUser();
public void delete(String id);
}
