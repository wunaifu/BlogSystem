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
	private String id;//自增
	private String phone;//联系方式（登陆账号）
	private String nickname;//昵称
	private String password;
	private String name;
	private String age;
	private String gender;//性别:男（1）女（0）
	private String address;
	private String profession;//职业
	private String introduction;//个人简介
	private String type="0";//用户类型:普通用户（0）管理员（1）
	public User() {
		super();
	}

	public User(String id, String phone, String nickname, String password, String name, String age,
				String gender, String address, String profession, String introduction,String type) {
		super();
		this.id = id;
		this.phone = phone;
		this.phone = phone;
		this.nickname = nickname;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.profession = profession;
		this.introduction = introduction;
		this.type = type;
	}
	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GenericGenerator(name = "generator", strategy = "uuid")
	@GeneratedValue(generator = "generator")
//    @GeneratedValue(strategy=GenerationType.AUTO)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "phone", nullable = false, length = 32)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "nickname", nullable = true, length = 32)
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "password", nullable = false, length = 32)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", nullable = true, length = 32)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age", nullable = true, length = 11)
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "gender", nullable = true, length = 11)
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "address", nullable = true, length = 32)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "profession", nullable = true, length = 32)
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Column(name = "introduction", nullable = true)
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Column(name = "type", nullable = false, length = 11)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + ", nickname=" + nickname
				+ ", password=" + password + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + ", address=" + address
				+ ", profession=" + profession + ", introduction="
				+ introduction + ", type=" + type + "]";
	}

}
