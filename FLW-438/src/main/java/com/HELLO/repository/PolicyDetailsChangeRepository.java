import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyDetailsChangeRepository extends JpaRepository<PolicyDetailsChange, Long> {
    
    @Query("SELECT pdc FROM PolicyDetailsChange pdc WHERE pdc.assigned = true")
    List<PolicyDetailsChange> findPolicyDetailsChangeForApprover();

    @Query("SELECT pdc FROM PolicyDetailsChange pdc WHERE pdc.maker = :maker")
    List<PolicyDetailsChange> findPolicyDetailsChangeByMaker(String maker);

    @Modifying
    @Query("UPDATE PolicyDetailsChange SET status = :status, approver_notes = :approverNotes WHERE id = :id")
    int updateStatusAndNotes(long id, int status, String approverNotes);

}