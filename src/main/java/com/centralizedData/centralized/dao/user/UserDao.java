package com.centralizedData.centralized.dao.user;

import com.centralizedData.centralized.model.user.User;

/**
 *
 *@author Akshatha
 *
 */
public interface UserDao {
	  User findById(int id);

			User findByUserName(String userName);
			
			User getUserIdByName(String userName);

			User findByEmployeeId(Integer employeeId);

	//	User findByEmployeeId(Integer employeeId);

//		void saveUser(User user);
//		void lockUser(String userName);
//		User findByLockedUserName(String userName);
//		User findByEmployeeId(Integer employeeId);


}
