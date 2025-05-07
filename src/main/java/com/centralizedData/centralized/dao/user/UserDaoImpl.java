package com.centralizedData.centralized.dao.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
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

import com.centralizedData.centralized.model.employee.Employee;
import com.centralizedData.centralized.model.user.User;



@Repository
public class UserDaoImpl  implements UserDao {
	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public User findByUserName(String userName) {
		logger.info("USERNAME in findByUserName() : {}", userName);
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> userRoot = query.from(User.class);
		query.select(userRoot).where(builder.equal(userRoot.get("userName"), userName));
		User user = null;
		try {
			user = entityManager.createQuery(query).getSingleResult();
		} catch (NoResultException e) {
			logger.info("NoResultException in findByUserName() !!!");
		}
		return user;
	}

	public User findById(int id) {
		logger.info("UserId in findById() : {}", id);
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> userRoot = query.from(User.class);
		query.select(userRoot).where(builder.equal(userRoot.get("userId"), id));
		User user = null;
		try {
			user = entityManager.createQuery(query).getSingleResult();
		} catch (NoResultException e) {
			logger.info("NoResultException in findByUserName() !!!");
		}
		return user;
	}

	@Override
	public User getUserIdByName(String userName) {
		logger.info("USERNAME in findByUserName() : {}", userName);
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> userRoot = query.from(User.class);
		List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(builder.equal(userRoot.get("userName"), userName));
        query.select(builder.construct(User.class, userRoot.get("userId")))
        .where(builder.and(predicateList.toArray(new Predicate[predicateList.size()])));
        User user = null;
        try {
			user = entityManager.createQuery(query).getSingleResult();
		} catch (NoResultException e) {
			logger.info("NoResultException in getUserIdByName() !!!");
		}
        return user;
	}
//	@Override
//	public User findByEmployeeId(Integer employeeId) {
//		logger.info("EMPLOYEE_ID in findByEmployeeId() : {}", employeeId);
//		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<User> query = builder.createQuery(User.class);
//		Root<User> userRoot = query.from(User.class);
//		Join<User, Employee> employee = userRoot.join("employee", JoinType.INNER);
//		List<Predicate> predicateList = new ArrayList<>();
//		predicateList.add(builder.equal(employee.get("employeeId"), employeeId));
//		predicateList.add(builder.equal(userRoot.get("isActive"), true));
//		predicateList.add(builder.equal(employee.get("isActive"), true));
//		predicateList.add(builder.equal(employee.get("active"), true));
//		query.select(builder.construct(User.class, userRoot.get("userId")))
//				.where(builder.and(predicateList.toArray(new Predicate[predicateList.size()])));
//		User user = null;
//		try {
//			user = entityManager.createQuery(query).getSingleResult();
//		} catch (NoResultException e) {
//			logger.info("NoResultException in findByLockedUserName() !!!");
//		}
//		return user;
//	}

	@Override
	public User findByEmployeeId(Integer employeeId) {
		logger.info("EMPLOYEE_ID in findByEmployeeId() : {}", employeeId);
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> userRoot = query.from(User.class);
		Join<User, Employee> employee = userRoot.join("employee", JoinType.INNER);
		List<Predicate> predicateList = new ArrayList<>();
		predicateList.add(builder.equal(employee.get("employeeId"), employeeId));
		predicateList.add(builder.equal(userRoot.get("isActive"), true));
		predicateList.add(builder.equal(employee.get("isActive"), true));
		predicateList.add(builder.equal(employee.get("active"), true));
		query.select(builder.construct(User.class, userRoot.get("userId")))
				.where(builder.and(predicateList.toArray(new Predicate[predicateList.size()])));
		User user = null;
		try {
			user = entityManager.createQuery(query).getSingleResult();
		} catch (NoResultException e) {
			logger.info("NoResultException in findByLockedUserName() !!!");
		}
		return user;
	}

}
