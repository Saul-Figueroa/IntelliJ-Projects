package com.springboot.roomwebapp.controllers;

import com.springboot.roomwebapp.service.StaffMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private final StaffMemberService staffMemberService;


    public StaffController(StaffMemberService staffMemberService) {
        this.staffMemberService = staffMemberService;
    }

    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("staff", staffMemberService.getAllStaff());
        return "staff";
    }
}
