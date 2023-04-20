package com.HELLO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HELLO.model.BulkProcess;
import com.HELLO.service.BulkProcessService;

@RestController
@RequestMapping("/bulkprocess")
public class BulkProcessController {
    
    @Autowired
    private BulkProcessService bulkProcessService;
    
    @PostMapping("/claims-settlement")
    public void acceptBulkClaimsSettlementRequests(@RequestBody BulkProcess bulkProcess) {
        bulkProcessService.acceptBulkClaimsSettlementRequests(bulkProcess.getInputFile());
    }
    
    @PostMapping("/data-upload")
    public void allowBulkDataUploadForNewBusinessAndRenewal(@RequestBody BulkProcess bulkProcess) {
        bulkProcessService.allowBulkDataUploadForNewBusinessAndRenewal(bulkProcess.getInputFile());
    }
    
    @PostMapping("/data-movement")
    public void allowBulkDataMovementWithinLIC(@RequestBody BulkProcess bulkProcess) {
        bulkProcessService.allowBulkDataMovementWithinLIC(bulkProcess.getInputFile());
    }

}