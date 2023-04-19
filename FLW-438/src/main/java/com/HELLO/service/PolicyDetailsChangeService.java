package com.HELLO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.HELLO.model.PolicyDetailsChange;
import com.HELLO.repository.PolicyDetailsChangeRepository;

import java.util.List;

@Service
public class PolicyDetailsChangeService {

    @Autowired
    private PolicyDetailsChangeRepository policyDetailsChangeRepository;

    public List<PolicyDetailsChange> findPolicyDetailsChangeForApprover() {
        return policyDetailsChangeRepository.findPolicyDetailsChangeForApprover();
    }

    public List<PolicyDetailsChange> findPolicyDetailsChangeByMaker(String maker) {
        return policyDetailsChangeRepository.findPolicyDetailsChangeByMaker(maker);
    }

    public int updateStatusAndNotes(long id, int status, String approverNotes) {
        return policyDetailsChangeRepository.updateStatusAndNotes(id, status, approverNotes);
    }

}