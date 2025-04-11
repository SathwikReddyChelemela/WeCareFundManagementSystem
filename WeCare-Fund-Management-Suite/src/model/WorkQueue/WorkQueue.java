/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workReqList;
    
    public WorkQueue() {
        workReqList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkReqList() {
        return workReqList;
    }

    public void setWorkReqList(ArrayList<WorkRequest> workReqList) {
        this.workReqList = workReqList;
    }

    
    
}
