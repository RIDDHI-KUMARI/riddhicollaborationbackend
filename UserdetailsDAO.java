package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.Userdetails;

public interface UserdetailsDAO {
void saveorUpdate(Userdetails userdetails);
void edit(Userdetails userdetails);
Userdetails get(String id);
List<Userdetails> listAllUserdetails();
Userdetails FindById(String id);
void deleteUserdetails(String id);
}
