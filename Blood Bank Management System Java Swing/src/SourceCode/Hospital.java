package SourceCode;

public class Hospital extends User {

    private int branchCode;

    public Hospital(String name, String address, String emailId, int phoneNumber, int branchCode) {
        super(name, address, emailId, phoneNumber);
        this.branchCode = branchCode;
    }

    public int getBranchCode() {
        return branchCode;
    }

    // <editor-fold defaultstate="collapsed" desc="Hospital Methods">
    public void OrderBlood()
    {
        //order blood code goes here
    }
    
    public void PurchaseBlood()
    {
        //purchase blood code goes here
    }
    
    // </editor-fold>
}
