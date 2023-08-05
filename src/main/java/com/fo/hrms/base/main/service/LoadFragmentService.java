/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fo.hrms.base.main.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 *
 * @author sif-
 */
@Service
public class LoadFragmentService {

    public void getDetail(String fragment,Model model) {
        
        switch(fragment){
            
            case "home":
                model.addAttribute("pagetilte", "Dashboard");
               break;
            case "profile":
                model.addAttribute("pagetilte", "Profile");
               break;    
            case "request":
                model.addAttribute("pagetilte", "Request LEave");
               break;  
            case "balance":
                model.addAttribute("pagetilte", "Leave Balance");
               break;                 
               
            default :
                
                break;
            
        
        }
        
    }
    
    
    
}
