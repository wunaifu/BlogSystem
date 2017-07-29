package com.fu.ssh.controller;

import java.util.List;
import java.util.Map;
import java.util.Objects;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fu.ssh.entity.User;
import com.fu.ssh.service.UserService;


/*
 * @Controller用于告诉服务器，这个类是SpringMVC中的控制层，这个类可以接收和处理用户请求
 * @RequestMapping用来处理请求地址映射，value指请求的实际地址
 * @RequestMapping用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径
 */
@SessionAttributes(value = "username")
@Controller
@RequestMapping(value = "/user")
public class UserController {


	@Autowired
	public UserService userService;

	/**
	 * 登录请求，失败返回error.jsp
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login")
	public String dologin(String username, String password, Map<String, Object> map) {
		if (username.equals("admin") && password.equals("admin")) {
			map.put("username", username);//存放在request请求域中
			/**
			 * 类上加上@SessionAttributes({"username"}) 同时也会存放在 session域中
			 * @SessionAttributes 除了可以通过属性名指定需要存放到会话中的属性外(使用的是value属性值)
			 * 还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中(实际上使用的是types属性值),
			 */
			return "frame";
		}
		return "error";
	}

	/**
	 * 保存添加的数据
	 *
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/saveuser")
	public String saveUser(User user) {
		userService.addUser(user);
		return "redirect:main";
	}

	/**
	 * 跳转到添加页面
	 * savepage.jsp
	 * @return
	 */
	@RequestMapping(value = "/adduser")
	public String saveUser() {

		return "savepage";
	}

	/**
	 * 删除一条数据
	 *
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/deleteUserById")
	public String deleteUserById(@RequestParam(value = "id") String id) {
		System.out.println("删除单个");
		userService.deleteUserById(id);
		return "redirect:main";
	}

	/**
	 * 跳转到更新页面，回显数据
	 * editpage.jsp
	 * @param id
	 * @param model 使用的Model保存回显数据
	 * @return
	 */
	@RequestMapping(value = "/doupdate")
	public String doupdate(@RequestParam(value = "id") String id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "editpage";
	}

	/**
	 * 更新数据
	 *
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateuser")
	public String updateUser(User user) {
		System.out.println(user.toString());
		userService.updateUser(user);
		return "redirect:main";
	}

	/**
	 * 查询所有人员信息
	 *
	 * @param map 使用的是map保存回显数据
	 * @return
	 */
	@RequestMapping(value = "/main")
	public String main(Map<String, Object> map) {
		List<User> userList=userService.getUsers();
		System.out.println("main"+userList.size());
		map.put("userlist",userList );
		/*遍历集合，查看查询到的数据
		 * List<User> lists = userService.getUsers(); 
		 * Iterator<User> it = lists.iterator(); 
		 * while(it.hasNext()){ 
		 * 		User p =it.next();
		 *	 	System.out.println(p.toString());
		 *  }
		 */
		return "main";
	}
}
