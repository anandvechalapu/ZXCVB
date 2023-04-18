.

public class PolicyMerger { 
 
    private String sourcePolicyNumber; 
    private String sourceMasterPolicyNumber; 
    private String sourceMasterPolicyStatus; 
    private String sourceProduct; 
    private String sourceVariant; 
    private String sourceSubVariant; 
    private int sourceTotalNumberOfMembers; 
    private double sourceTotalFundBalance;
    private String sourceFrequency; 
    private String sourceARD; 
    private String sourceCategory; 
    private String sourceClaimPending; 
 
    private String destinationPolicyNumber; 
    private String destinationMasterPolicyNumber; 
    private String destinationMasterPolicyStatus; 
    private String destinationProduct; 
    private String destinationVariant; 
    private String destinationSubVariant; 
    private int destinationTotalNumberOfMembers; 
    private double destinationTotalFundBalance; 
    private String destinationFrequency; 
    private String destinationARD; 
    private String destinationCategory; 
    private String destinationClaimPending;
 
    private String policySearchByNumber; 
    private String policySearchByCriteria; 
 
    public void mergePolicies() { 
        // validate source and destination policy attributes 
        if (!validateSourceAndDestinationAttributes()) { 
            return; 
        } 
 
        // search for destination policy using policy search pop-up 
        if (!searchForDestinationPolicy()) { 
            return; 
        } 
 
        // align ARD and frequency between merging policy and destination policy using policy services route 
        if (!alignARDAndFrequency()) { 
            return; 
        } 
 
        // accumulate member balance up to date of merger 
        accumulateMemberBalance(); 
 
        // calculate fund value along with interest on effective date of request for merging policy 
        calculateFundValue(); 
 
        // move all data to new unit and agents mapped in new policy 
        moveDataToNewUnit(); 
 
        // validate merging policy and destination policy schema and versions 
        if (!validateSchemaAndVersions()) { 
            return; 
        } 
 
        // if only fund is merged then same ARD is not required 
        if (!requireSameARD()) { 
            return; 
        } 
 
        // initiate merger 
        initiateMerger(); 
 
        // generate updated details of target policy 
        generateUpdatedDetails(); 
 
        // save request for further processing or send to checker for approval 
        saveRequest(); 
    } 
 
    private boolean validateSourceAndDestinationAttributes() { 
        // TODO: implement validation logic 
        return true; 
    } 
 
    private boolean searchForDestinationPolicy() { 
        // TODO: implement search logic 
        return true; 
    } 
 
    private boolean alignARDAndFrequency() { 
        // TODO: implement alignment logic 
        return true; 
    } 
 
    private void accumulateMemberBalance() { 
        // TODO: implement logic to accumulate member balance 
    } 
 
    private void calculateFundValue() { 
        // TODO: implement logic to calculate fund value 
    } 
 
    private void moveDataToNewUnit() { 
        // TODO: implement logic to move data to new unit 
    } 
 
    private boolean validateSchemaAndVersions() { 
        // TODO: implement validation logic 
        return true; 
    } 
 
    private boolean requireSameARD() { 
        // TODO: implement logic 
        return true; 
    } 
 
    private void initiateMerger() { 
        // TODO: implement logic to initiate merger 
    } 
 
    private void generateUpdatedDetails() { 
        // TODO: implement logic to generate updated details 
    } 
 
    private void saveRequest() { 
        // TODO: implement logic to save request 
    } 
}