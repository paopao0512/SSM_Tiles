package com.mvc.controller;

import com.mvc.model.Student;
import com.mvc.model.User;
import com.mvc.service.PersonService;
import com.mvc.util.*;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class VerifyController {

	private static final String PASSWORD_CRYPT_KEY = "779654316";// 示例密钥

	@Autowired
	private PersonService personService;

	//登陆
	/*@RequestMapping(value = "/lock")
	public String Verify(HttpServletRequest request, User user) throws Exception{
		String pwd = user.getPassword();
		User in = personService.queryUser(user.getUserName());
		String pwd2 = in.getPassword();
		System.out.println(user + "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		if(in !=null){
			if(MD5Lock.validPassword(pwd,pwd2) !=false) {
				HttpSession session = request.getSession();
				session.setAttribute("id", in.getID());
				return "redirect:/rest/home";
			}
		}
		return "redirect:index";
	}*/

	//登陆
	@RequestMapping(value = "/lock")
	public String Verify(HttpServletResponse httpResponse, User user) throws Exception{
		String pwd = user.getPassword();
		User in = personService.queryUser(user.getUserName());
		String pwd2 = in.getPassword();
		System.out.println(user + "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		if(in !=null){
			if(MD5Lock.validPassword(pwd,pwd2) !=false) {
				SpringAutoBind sp = new SpringAutoBind();
				int pp = in.getID();
				Long dd = sp.convert(NowTime.nowTime());
				String bb = pp+"|"+dd;
				String cc = DESUlit.encrypt(bb, PASSWORD_CRYPT_KEY);
				int  loginMaxAge = 30*24*60*60;
				CookieTool.addCookie(httpResponse, "token", Base64.encodeBase64String(cc.getBytes("utf-8")), loginMaxAge); //将加密后的DES加入到cookie中
				/*HttpSession session = request.getSession();
				session.getId();
				session.setAttribute("id", in.getID());*/
				return "redirect:/home";
			}
		}
		return "redirect:index";
	}

	//退出
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,HttpServletResponse response) throws Exception {

		CookieTool.addCookie(response, "token", "0", 0);
		/*HttpSession session = request.getSession();
		session.invalidate();*/
		return "redirect:/home";
	}

	//注册
	@RequestMapping("/register")
	public String addUser(User user)throws Exception{
		user.setPassword(MD5Lock.getEncryptedPwd(user.getPassword()));
		personService.addUser(user);
		return "redirect:index";
	}

	@RequestMapping("/new")
	public String n(){
		return "newUser";
	}

	@RequestMapping(value = "/home")
	public String queryWork(Model model)throws Exception{
		int student = personService.queryWork(1);
		int student1 = personService.queryWork(0);
		List<Student> student2 = personService.queryGood(1);
		System.out.println(student+"wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		System.out.println(student1+"fffffffffffffffffffffffffffffffffffffffff");
		System.out.println(student2+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
		model.addAttribute("items1",student1);
		model.addAttribute("items",student);
		model.addAttribute("items2",student2);
		return "homepage";
	}
}
