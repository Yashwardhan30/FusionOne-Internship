/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fo.hrms.base.main.controller;

import com.fo.hrms.base.main.service.LoadFragmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author
 */
@Controller
public class MainController {
    
    @Autowired
    LoadFragmentService fragmentService;
    
    @RequestMapping("/")
    public String loginPage(){
        return "login";
    }
    
    @RequestMapping(value="loadFragment" , method = RequestMethod.GET)
    public String nextFragment(@RequestParam("fragment") String fragment,Model model){
    
        fragmentService.getDetail(fragment,model);
        System.out.println("Fragment No="+fragment);
        return "segments/user/"+fragment;
        
    
    }
    
    @RequestMapping(value="loadPage" , method = RequestMethod.GET)
    public String pageFragment(@RequestParam("pageIs") String page,Model model){
        System.out.println("Page Is ="+page);
        return "segments/user/fragment/"+page ;
        
    
    }
    
}
