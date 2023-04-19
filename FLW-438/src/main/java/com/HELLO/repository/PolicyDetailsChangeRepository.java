import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyDetailsChangeRepository extends JpaRepository<PolicyDetailsChange, Long> {
 
    List<PolicyDetailsChange> findAllByAssignedToApproverAndStatus(String approver, String status);
    List<PolicyDetailsChange> findAllByAssignedToApproverAndStatusAndEditable(String approver, String status, boolean editable);
    PolicyDetailsChange findByServiceNoAndEditable(String serviceNo, boolean editable);
    PolicyDetailsChange findByServiceNoAndAssignedToApprover(String serviceNo, String assignedToApprover);
    List<PolicyDetailsChange> findAllByAssignedToApproverAndStatusAndDecisionAndEditable(String approver, String status, String decision, boolean editable);
    List<PolicyDetailsChange> findAllByMakerCommentsNotNullAndAssignedToApproverAndStatus(String approver, String status);
    List<PolicyDetailsChange> findAllByApproverCommentsNotNullAndAssignedToApproverAndStatus(String approver, String status);
}

package com.HELLO.repository;