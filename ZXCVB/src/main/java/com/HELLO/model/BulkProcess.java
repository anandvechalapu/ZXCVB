package com.HELLO.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BulkProcess {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String inputFile;
    
    public BulkProcess() {
        
    }
    
    public BulkProcess(String inputFile) {
        this.inputFile = inputFile;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getInputFile() {
        return inputFile;
    }
    
    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }
    
    //Bulk Claims Settlement
    public void acceptBulkClaimsSettlementRequests(String inputFile) {
        
    }
    
    public void validateFormatOfInputFile(String inputFile) {
        
    }
    
    public void processClaimsSettlementRequests(String inputFile) {
        
    }
    
    public void generateClaimsSettlementReport(String inputFile) {
        
    }
    
    //Bulk Data Upload for New Business and Renewal
    public void allowBulkDataUploadForNewBusinessAndRenewal(String inputFile) {
        
    }
    
    public void validateFormatOfInputFileForDataUpload(String inputFile) {
        
    }
    
    public void createNewBusinessAndRenewalRecords(String inputFile) {
        
    }
    
    public void generateDataUploadReport(String inputFile) {
        
    }
    
    //Bulk Data Movement within LIC
    public void allowBulkDataMovementWithinLIC(String inputFile) {
        
    }
    
    public void validateFormatOfInputFileForDataMovement(String inputFile) {
        
    }
    
    public void updateRelevantFieldsInSystem(String inputFile) {
        
    }
    
    public void generateDataMovementReport(String inputFile) {
        
    }
}