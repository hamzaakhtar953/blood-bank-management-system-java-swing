package SourceCode.Blood;

public class Blood {

    private int bloodID;
    private String bloodType;

    public Blood(int bloodID, String bloodType) {
        this.bloodID = bloodID;
        this.bloodType = bloodType;
    }

    public int getBloodID() {
        return bloodID;
    }

    public String getBloodType() {
        return bloodType;
    }

}
