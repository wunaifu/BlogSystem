package com.fu.ssh.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fu.ssh.entity.User;

@Repository
public class UserDAO {

	@Resource
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public User getUserById(String id) {
		return (User) this.getSession().createQuery("from User where id=?").setParameter(0, Integer.parseInt(id)).uniqueResult();
	}

	/**
	 * 添加
	 * @param user
	 */
	public void addUser(User user) {
		this.getSession().save(user);
	}

	/**
	 * 更新
	 * @param user
	 */
	public void updateUser(User user) {
		this.getSession().update(user);
	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteUserById(String id) {
		this.getSession().createQuery("delete User where id=?").setParameter(0, Integer.parseInt(id)).executeUpdate();
	}

	/**
	 * 查询所有
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		return this.getSession().createCriteria(User.class).list();
	}
}
