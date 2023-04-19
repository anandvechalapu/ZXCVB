package com.HELLO.controller;

import com.HELLO.model.PolicyDetailsChange;
import com.HELLO.service.PolicyDetailsChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PolicyDetailsChangeController {

    @Autowired
    private PolicyDetailsChangeService policyDetailsChangeService;

    @GetMapping("/findAllByAssignedToApproverAndStatus")
    public List<PolicyDetailsChange> findAllByAssignedToApproverAndStatus(@RequestParam("approver") String approver, @RequestParam("status") String status) {
        return policyDetailsChangeService.findAllByAssignedToApproverAndStatus(approver, status);
    }

    @GetMapping("/findAllByAssignedToApproverAndStatusAndEditable")
    public List<PolicyDetailsChange> findAllByAssignedToApproverAndStatusAndEditable(@RequestParam("approver") String approver, @RequestParam("status") String status, @RequestParam("editable") boolean editable) {
        return policyDetailsChangeService.findAllByAssignedToApproverAndStatusAndEditable(approver, status, editable);
    }

    @GetMapping("/findByServiceNoAndEditable")
    public PolicyDetailsChange findByServiceNoAndEditable(@RequestParam("serviceNo") String serviceNo, @RequestParam("editable") boolean editable) {
        return policyDetailsChangeService.findByServiceNoAndEditable(serviceNo, editable);
    }

    @GetMapping("/findByServiceNoAndAssignedToApprover")
    public PolicyDetailsChange findByServiceNoAndAssignedToApprover(@RequestParam("serviceNo") String serviceNo, @RequestParam("assignedToApprover") String assignedToApprover) {
        return policyDetailsChangeService.findByServiceNoAndAssignedToApprover(serviceNo, assignedToApprover);
    }

    @GetMapping("/findAllByAssignedToApproverAndStatusAndDecisionAndEditable")
    public List<PolicyDetailsChange> findAllByAssignedToApproverAndStatusAndDecisionAndEditable(@RequestParam("approver") String approver, @RequestParam("status") String status, @RequestParam("decision") String decision, @RequestParam("editable") boolean editable) {
        return policyDetailsChangeService.findAllByAssignedToApproverAndStatusAndDecisionAndEditable(approver, status, decision, editable);
    }

    @GetMapping("/findAllByMakerCommentsNotNullAndAssignedToApproverAndStatus")
    public List<PolicyDetailsChange> findAllByMakerCommentsNotNullAndAssignedToApproverAndStatus(@RequestParam("approver") String approver, @RequestParam("status") String status) {
        return policyDetailsChangeService.findAllByMakerCommentsNotNullAndAssignedToApproverAndStatus(approver, status);
    }

    @GetMapping("/findAllByApproverCommentsNotNullAndAssignedToApproverAndStatus")
    public List<PolicyDetailsChange> findAllByApproverCommentsNotNullAndAssignedToApproverAndStatus(@RequestParam("approver") String approver, @RequestParam("status") String status) {
        return policyDetailsChangeService.findAllByApproverCommentsNotNullAndAssignedToApproverAndStatus(approver, status);
    }

}