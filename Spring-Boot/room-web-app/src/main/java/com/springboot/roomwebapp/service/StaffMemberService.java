package com.springboot.roomwebapp.service;

import com.springboot.roomwebapp.data.StaffRepository;
import com.springboot.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffMemberService {

    private final StaffRepository staffRepository;

    public StaffMemberService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }


    public List<StaffMember> getAllStaff(){

        return staffRepository.findAll();
    }
}
