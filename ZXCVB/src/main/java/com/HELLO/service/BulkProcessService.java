package com.HELLO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HELLO.repository.BulkProcessRepository;

@Service
public class BulkProcessService {
    
    @Autowired
    BulkProcessRepository bulkProcessRepository;

    //Bulk Claims Settlement
    public void acceptBulkClaimsSettlementRequests(String inputFile){
        bulkProcessRepository.acceptBulkClaimsSettlementRequests(inputFile);
    }
    public void validateFormatOfInputFile(String inputFile){
        bulkProcessRepository.validateFormatOfInputFile(inputFile);
    }
    public void processClaimsSettlementRequests(String inputFile){
        bulkProcessRepository.processClaimsSettlementRequests(inputFile);
    }
    public void generateClaimsSettlementReport(String inputFile){
        bulkProcessRepository.generateClaimsSettlementReport(inputFile);
    }

    //Bulk Data Upload for New Business and Renewal
    public void allowBulkDataUploadForNewBusinessAndRenewal(String inputFile){
        bulkProcessRepository.allowBulkDataUploadForNewBusinessAndRenewal(inputFile);
    }
    public void validateFormatOfInputFileForDataUpload(String inputFile){
        bulkProcessRepository.validateFormatOfInputFileForDataUpload(inputFile);
    }
    public void createNewBusinessAndRenewalRecords(String inputFile){
        bulkProcessRepository.createNewBusinessAndRenewalRecords(inputFile);
    }
    public void generateDataUploadReport(String inputFile){
        bulkProcessRepository.generateDataUploadReport(inputFile);
    }

    //Bulk Data Movement within LIC
    public void allowBulkDataMovementWithinLIC(String inputFile){
        bulkProcessRepository.allowBulkDataMovementWithinLIC(inputFile);
    }
    public void validateFormatOfInputFileForDataMovement(String inputFile){
        bulkProcessRepository.validateFormatOfInputFileForDataMovement(inputFile);
    }
    public void updateRelevantFieldsInSystem(String inputFile){
        bulkProcessRepository.updateRelevantFieldsInSystem(inputFile);
    }
    public void generateDataMovementReport(String inputFile){
        bulkProcessRepository.generateDataMovementReport(inputFile);
    }

}