package SourceCode.Users;

public class Hospital extends User {

    private int branchCode; //user will enter

    public Hospital(int userId, int branchCode, String name, String address, String emailId, String username, String password, int phoneNumber, String userType) {
        super(userId, name, address, emailId, username, password, phoneNumber, userType);
        this.branchCode = branchCode;
    }

    public int getBranchCode() {
        return branchCode;
    }

    // <editor-fold defaultstate="collapsed" desc="Hospital Methods">
    public void orderBlood() {
        //order blood code goes here
    }

    public void purchaseBlood() {
        //purchase blood code goes here
    }

    // </editor-fold>
}
