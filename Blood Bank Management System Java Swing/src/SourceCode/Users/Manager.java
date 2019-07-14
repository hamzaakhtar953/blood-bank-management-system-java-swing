package SourceCode.Users;

import SourceCode.Blood.Blood;
import java.util.ArrayList;

public class Manager extends User {

    private int employeeId; //System will generate
    private ArrayList<Blood> bloodList;

    public Manager(int userId, int employeeId, String name, String address, String emailId, String username, String password, int phoneNumber, String userType) {
        super(userId, name, address, emailId, username, password, phoneNumber, userType);
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
