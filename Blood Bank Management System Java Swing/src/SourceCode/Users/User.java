package SourceCode.Users;

public class User {

    private int userId;
    private String name;
    private String address;
    private String emailId;
    private String username;
    private String password;
    private String location;
    private int phoneNumber;
    private String userType;

    public User(int userId, String name, String address, String emailId, String username, String password, int phoneNumber, String userType) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.emailId = emailId;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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
