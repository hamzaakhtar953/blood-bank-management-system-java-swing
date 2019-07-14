package SourceCode;

import java.util.ArrayList;
import java.util.List;

public class LabAssistant extends User {

    private int employeeId;
    private List<Donor> donors;

    public LabAssistant(String name, String address, String emailId, Integer phoneNumber, int employeeId) {
        super(name, address, emailId, phoneNumber);
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
