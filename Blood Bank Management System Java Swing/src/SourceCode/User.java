
package SourceCode;

public class User {

    private String name;
    private String address;
    private String emailId;
    private String location;
    private Integer phoneNumber;

    public User(String name, String address, String emailId, Integer phoneNumber) {
        this.name = name;
        this.address = address;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return (name + " lives at " + address + "\n"
                + "Contact details: \n\n"
                + "Email: " + emailId + "\n"
                + "Contact: " + phoneNumber);
    }
}
