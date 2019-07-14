package SourceCode.Users;

import java.util.ArrayList;
import java.util.List;

public class Receptionist extends User {

    private List<Donor> donors;

    public Receptionist(int userId, String name, String address, String emailId, String username, String password, int phoneNumber, String userType) {
        super(userId, name, address, emailId, username, password, phoneNumber, userType);
        donors = new ArrayList<Donor>();
    }

    public void registerDonor(Donor donor) {
        this.donors.add(donor);
    }

}
