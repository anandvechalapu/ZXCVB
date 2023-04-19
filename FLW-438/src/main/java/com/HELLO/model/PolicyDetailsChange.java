import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyDetailsChange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String serviceNo;
    private String assignedToApprover;
    private String status;
    private String decision;
    private boolean editable;
    private String makerComments;
    private String approverComments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public String getAssignedToApprover() {
        return assignedToApprover;
    }

    public void setAssignedToApprover(String assignedToApprover) {
        this.assignedToApprover = assignedToApprover;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public String getMakerComments() {
        return makerComments;
    }

    public void setMakerComments(String makerComments) {
        this.makerComments = makerComments;
    }

    public String getApproverComments() {
        return approverComments;
    }

    public void setApproverComments(String approverComments) {
        this.approverComments = approverComments;
    }

}