package com.HELLO.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_details_change")
public class PolicyDetailsChange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "maker")
    private String maker;

    @Column(name = "assigned")
    private boolean assigned;

    @Column(name = "status")
    private int status;

    @Column(name = "approver_notes")
    private String approverNotes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getApproverNotes() {
        return approverNotes;
    }

    public void setApproverNotes(String approverNotes) {
        this.approverNotes = approverNotes;
    }

}