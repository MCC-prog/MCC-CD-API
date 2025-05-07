package com.centralizedData.centralized.dao.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.dto.admission.UserInfoDto;
import com.centralizedData.centralized.model.employee.Department;
import com.centralizedData.centralized.model.employee.Employee;
import com.centralizedData.centralized.model.user.User;



@Repository("userInfoDao")
public class UserInfoDaoImpl implements UserInfoDao {

		
		static final Logger logger = LoggerFactory.getLogger(UserInfoDaoImpl.class);

		@PersistenceContext
		private EntityManager entityManager;

		@Override
		public UserInfoDto getUserInfo(Integer userId) {
			logger.info("Getting User Info: "+userId); 
			CriteriaBuilder builder = entityManager.getCriteriaBuilder();
			CriteriaQuery<UserInfoDto> query = builder.createQuery(UserInfoDto.class);
			Root<User> userRoot = query.from(User.class);
			Join<User, Employee> emp = userRoot.join("employee", JoinType.INNER);
			//Join<Employee, Designation> desig = emp.join("designation", JoinType.INNER);
			Join<Employee, Department> dept = emp.join("department", JoinType.INNER);
			List<Predicate> predicateList = new ArrayList<>();
			predicateList.add(builder.equal(userRoot.get("userId"),userId));
			predicateList.add(builder.equal(emp.get("isActive"), true));
			query.select(builder.construct(UserInfoDto.class, emp.get("firstName"), 
			dept.get("departmentName"),
			emp.get("currentAddressMobile1"),emp.get("permanentAddressLine1"),
			emp.get("workEmail")))
			.where(builder.and(predicateList.toArray(new Predicate[predicateList.size()])));
			UserInfoDto userInfo = entityManager.createQuery(query).getSingleResult();
			return userInfo;
		}


}
