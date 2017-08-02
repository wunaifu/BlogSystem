package com.fu.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_tab")
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;//自增

	@Column(name = "phone", nullable = false, length = 32)
	private String phone;//联系方式（登陆账号）

	@Column(name = "nickname",  length = 32)
	private String nickname;//昵称

	@Column(name = "password",  length = 32)
	private String password;

	@Column(name = "name",  length = 32)
	private String name;

	@Column(name = "age",  length = 32)
	private String age;

	@Column(name = "gender",  length = 32)
	private String gender;//性别:男（1）女（0）

	@Column(name = "address",  length = 32)
	private String address;

	@Column(name = "profession",  length = 32)
	private String profession;//职业

	@Column(name = "introduction",  length = 32)
	private String introduction;//个人简介

	@Column(name = "type",  length = 32)
	private String type="0";//用户类型:普通用户（0）管理员（1）

	//    @Id
//	@Column(name = "id", nullable = false, unique = true)
//	@GenericGenerator(name = "generator", strategy = "uuid")
//	@GeneratedValue(generator = "generator")
//    @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	//	@Column(name = "password", nullable = false, length = 32)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}
