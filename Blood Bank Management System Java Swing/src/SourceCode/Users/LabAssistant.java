package SourceCode.Users;

import java.util.ArrayList;
import java.util.List;

public class LabAssistant extends User {

    private int employeeId; //System will generate
    private List<Donor> donors;

    public LabAssistant(int userId, int employeeId, String name, String address, String emailId, String username, String password, int phoneNumber, String userType) {
        super(userId, name, address, emailId, username, password, phoneNumber, userType);
        this.employeeId = employeeId;
        this.donors = new ArrayList<Donor>();
    }

    public void registerDonor(Donor donor) {
        this.donors.add(donor);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void takeSampleTest() {
        // Take sample test
    }
    
    public void forwardSample() {
        // Forward Sample
    }
    
    public void drawSalary() {
        // Draw Salary
    }

}
