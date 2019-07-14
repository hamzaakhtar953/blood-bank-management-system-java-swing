package SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Receptionist extends User {

    private List<Donor> donors;

    public Receptionist(String name, String address, String emailId, Integer phoneNumber) {
        super(name, address, emailId, phoneNumber);
        donors = new ArrayList<Donor>();
    }

    public void registerDonor(Donor donor) {
        this.donors.add(donor);
    }

}
