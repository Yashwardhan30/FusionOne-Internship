/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fo.hrms.base.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fo.hrms.base.auth.model.User;

/**
 *
 * @author sif-
 */
@Controller
//@RequestMapping("/authenticate")
public class LoginController {


	//@PostMapping("/login")
	@RequestMapping("authenticate")
	public String authoriseUser(){
		//System.out.println(user.getUsername());
		//System.out.println(user.getPassword());
		//String s=user.getUsername();
		//System.out.println(s);
		//if(s.equals("admin")) {
		//	return "layout/admin";
		//}else {
			return "layout/user";
		//}
	}
}
