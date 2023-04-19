import com.HELLO.model.PolicyDetailsChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyDetailsChangeRepository extends JpaRepository<PolicyDetailsChange, Long> {
 
}

package com.HELLO.service;

import com.HELLO.model.PolicyDetailsChange;
import com.HELLO.repository.PolicyDetailsChangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyDetailsChangeService {

    @Autowired
    private PolicyDetailsChangeRepository policyDetailsChangeRepository;

    public List<PolicyDetailsChange> findAllByAssignedToApproverAndStatus(String approver, String status) {
        return policyDetailsChangeRepository.findAllByAssignedToApproverAndStatus(approver, status);
    }

    public List<PolicyDetailsChange> findAllByAssignedToApproverAndStatusAndEditable(String approver, String status, boolean editable) {
        return policyDetailsChangeRepository.findAllByAssignedToApproverAndStatusAndEditable(approver, status, editable);
    }

    public PolicyDetailsChange findByServiceNoAndEditable(String serviceNo, boolean editable) {
        return policyDetailsChangeRepository.findByServiceNoAndEditable(serviceNo, editable);
    }

    public PolicyDetailsChange findByServiceNoAndAssignedToApprover(String serviceNo, String assignedToApprover) {
        return policyDetailsChangeRepository.findByServiceNoAndAssignedToApprover(serviceNo, assignedToApprover);
    }

    public List<PolicyDetailsChange> findAllByAssignedToApproverAndStatusAndDecisionAndEditable(String approver, String status, String decision, boolean editable) {
        return policyDetailsChangeRepository.findAllByAssignedToApproverAndStatusAndDecisionAndEditable(approver, status, decision, editable);
    }

    public List<PolicyDetailsChange> findAllByMakerCommentsNotNullAndAssignedToApproverAndStatus(String approver, String status) {
        return policyDetailsChangeRepository.findAllByMakerCommentsNotNullAndAssignedToApproverAndStatus(approver, status);
    }

    public List<PolicyDetailsChange> findAllByApproverCommentsNotNullAndAssignedToApproverAndStatus(String approver, String status) {
        return policyDetailsChangeRepository.findAllByApproverCommentsNotNullAndAssignedToApproverAndStatus(approver, status);
    }

}