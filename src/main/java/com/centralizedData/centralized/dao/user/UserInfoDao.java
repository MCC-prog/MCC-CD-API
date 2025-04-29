package com.centralizedData.centralized.dao.user;

import com.centralizedData.centralized.dto.admission.UserInfoDto;

public interface UserInfoDao {
	UserInfoDto getUserInfo(Integer userId);

}
