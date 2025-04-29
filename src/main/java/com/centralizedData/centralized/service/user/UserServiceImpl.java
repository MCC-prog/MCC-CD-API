package com.centralizedData.centralized.service.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centralizedData.centralized.dao.user.UserDao;
import com.centralizedData.centralized.model.user.User;



@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	   @Autowired
	private UserDao userDao;
	

	@Override
	public User findById(int id) {
		User user = userDao.findById(id);
		return user;
	}

	@Override
	public User findByUserName(String userName) {
		User user = userDao.findByUserName(userName);
		return user;
	}

	@Override
	public User getUserIdByName(String userName) {
		return userDao.getUserIdByName(userName);
	}

    @Override
    public void saveTokenById(Integer userId, String token) {
    	User user = userDao.findById(userId);
    	user.setJwtToken(token);
    }
    
    @Override
    public void JwtLogOut(String username) {
      User user = userDao.findByUserName(username);
    	user.setJwtToken(null);
    }

	@Override
	public User findByLockedUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
