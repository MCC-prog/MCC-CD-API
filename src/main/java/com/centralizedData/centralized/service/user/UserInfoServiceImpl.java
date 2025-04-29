package com.centralizedData.centralized.service.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centralizedData.centralized.dao.user.UserInfoDao;
import com.centralizedData.centralized.dto.admission.UserInfoDto;



@Service("userInfoService")
@Transactional
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public UserInfoDto getUserInfo(Integer userId) {
		return userInfoDao.getUserInfo(userId);
	}
}
