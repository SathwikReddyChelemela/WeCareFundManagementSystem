/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author team-11
 */
public class WorkRequest {
    
    private UserAccount sender;
    private UserAccount receiver;
    private String message;
    private String status;
    private Date requestDateTime;
    private Date resolveDateTime;

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Date requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public Date getResolveDateTime() {
        return resolveDateTime;
    }

    public void setResolveDateTime(Date resolveDateTime) {
        this.resolveDateTime = resolveDateTime;
    }
    
    public WorkRequest() {
        requestDateTime = new Date();
    }
    
}
