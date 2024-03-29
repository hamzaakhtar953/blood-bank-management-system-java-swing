package SourceCode.Users;

public class Donor extends User {

    public Donor(int userId, String name, String address, String emailId, String username, String password, int phoneNumber, String userType) {
        super(userId, name, address, emailId, username, password, phoneNumber, userType);
    }

    public void donateBlood() {
        /* 
         Here the donor will be presented with the option 
         of donating his/her blood. From the GUI perpective
         there will be a donate blood button. The request will
         be shown to the receptionist and he will accept or reject it
         */
    }

    public void decideToDonate() {
        /*
        Console generated option whether user wants to donate. 
        Actions performed based on answer: "Yes" or "No"
        */
    }
}
