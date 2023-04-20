package com.HELLO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BulkProcessRepository extends JpaRepository<BulkProcess, Long> {

    //Bulk Claims Settlement
    void acceptBulkClaimsSettlementRequests(String inputFile);
    void validateFormatOfInputFile(String inputFile);
    void processClaimsSettlementRequests(String inputFile);
    void generateClaimsSettlementReport(String inputFile);

    //Bulk Data Upload for New Business and Renewal
    void allowBulkDataUploadForNewBusinessAndRenewal(String inputFile);
    void validateFormatOfInputFileForDataUpload(String inputFile);
    void createNewBusinessAndRenewalRecords(String inputFile);
    void generateDataUploadReport(String inputFile);

    //Bulk Data Movement within LIC
    void allowBulkDataMovementWithinLIC(String inputFile);
    void validateFormatOfInputFileForDataMovement(String inputFile);
    void updateRelevantFieldsInSystem(String inputFile);
    void generateDataMovementReport(String inputFile);
}