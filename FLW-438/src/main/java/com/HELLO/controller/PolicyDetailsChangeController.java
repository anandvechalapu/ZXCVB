package com.HELLO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HELLO.model.PolicyDetailsChange;
import com.HELLO.service.PolicyDetailsChangeService;

import java.util.List;

@RestController
@RequestMapping("/policy-details-change")
public class PolicyDetailsChangeController {

    @Autowired
    private PolicyDetailsChangeService policyDetailsChangeService;

    @GetMapping("/approver")
    public List<PolicyDetailsChange> findPolicyDetailsChangeForApprover() {
        return policyDetailsChangeService.findPolicyDetailsChangeForApprover();
    }

    @GetMapping("/{maker}")
    public List<PolicyDetailsChange> findPolicyDetailsChangeByMaker(@PathVariable String maker) {
        return policyDetailsChangeService.findPolicyDetailsChangeByMaker(maker);
    }

    @PutMapping("/{id}/{status}/{approverNotes}")
    public int updateStatusAndNotes(@PathVariable long id, @PathVariable int status,
            @PathVariable String approverNotes) {
        return policyDetailsChangeService.updateStatusAndNotes(id, status, approverNotes);
    }

}