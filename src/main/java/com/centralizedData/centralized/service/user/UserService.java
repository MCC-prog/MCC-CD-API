package com.centralizedData.centralized.service.user;

import com.centralizedData.centralized.model.user.User;

public interface UserService {
	
	User findById(int id);

	User findByUserName(String userName);
	
	User getUserIdByName(String username);

	void saveTokenById(Integer userId, String token);

	void JwtLogOut(String username);

	User findByLockedUserName(String userName);


}
