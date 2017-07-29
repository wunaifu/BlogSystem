package com.fu.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fu.ssh.dao.UserDAO;
import com.fu.ssh.entity.User;


@Transactional
@Service
public class UserService {

	@Autowired
	public UserDAO userDAO;

	/**
	 * 添加
	 * @param user
	 */
	public void addUser(User user) {
		userDAO.addUser(user);
	}

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public User getUserById(String id){
		return userDAO.getUserById(id);
	}

	/**
	 * 更新
	 * @param user
	 */
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteUserById(String  id) {
		userDAO.deleteUserById(id);
	}

	/**
	 * 查询所有
	 * @return
	 */
	public List<User> getUsers() {
		return userDAO.getUsers();
	}
}
