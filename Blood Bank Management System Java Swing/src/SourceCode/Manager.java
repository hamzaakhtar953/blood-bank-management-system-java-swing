package SourceCode;

import SourceCode.Blood.Blood;
import java.util.ArrayList;

public class Manager extends User {

    private int employeeId;
    private ArrayList<Blood> bloodList;

    public Manager(int employeeId, String name, String address, String emailId, int phoneNumber) {
        super(name, address, emailId, phoneNumber);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // <editor-fold defaultstate="collapsed" desc="Manager Methods">
    public void approveDonor() {
        //approve donor code goes here
    }

    public void approveSample() {
        //approve sample code goes here
    }

    public void forwardRequest() {
        //forward request code goes here
    }

    public void drawSalary() {
        //draw salary code goes here
    }

    // </editor-fold>
}
