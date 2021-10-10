package com.springboot.roomwebapp.controllers;

import com.springboot.roomwebapp.models.StaffMember;
import com.springboot.roomwebapp.service.StaffMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffMemberService staffMemberService;

    public StaffRestController(StaffMemberService staffMemberService) {
        this.staffMemberService = staffMemberService;
    }

    @GetMapping
        public List<StaffMember> getAllStaff(){
            return staffMemberService.getAllStaff();
        }

}
