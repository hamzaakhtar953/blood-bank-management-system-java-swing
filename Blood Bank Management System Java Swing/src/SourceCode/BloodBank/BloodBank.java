package SourceCode.BloodBank;

import SourceCode.Users.*;
import java.util.ArrayList;
import java.util.List;
import static SourceCode.constants.Constants.*;

public class BloodBank {

    private String name;
    private String ISO_PERMISSION;
    private String address;
    private int branchCode;
    private int contact;
    private ArrayList<User> userList;

    private static BloodBank instance;
    static int currentIdNumber = 0;

    public BloodBank(String name, String ISO_PERMISSION, String address, int branchCode, int contact) {
        this.name = name;
        this.ISO_PERMISSION = ISO_PERMISSION;
        this.address = address;
        this.branchCode = branchCode;
        this.contact = contact;
        userList = new ArrayList<User>();
    }

    public static BloodBank getInstance() {
        if (instance == null) {
            instance = new BloodBank("xyz", "13", "walton", 152, 030000);
        }
        return instance;
    }

    public void Init() {
        userList.add(new User(++currentIdNumber, null, null, null, "admin", "123", -1, ADMIN));
    }

    public void createUser(String userType, String name, String address, String emailId, String username, String password, int phoneNumber, int branchCode) {
        User user = null;

        switch (userType) {
            case ASSISTANT:
                user = new LabAssistant(++currentIdNumber, EmployeeIdGenerator(), name, address, emailId, username, password, phoneNumber, userType);
                System.out.println("one");
                break;
            case MANAGER:
                user = new Manager(++currentIdNumber, EmployeeIdGenerator(), name, address, emailId, username, password, phoneNumber, userType);
                System.out.println("two");
                break;
            case DONOR:
                user = new Donor(++currentIdNumber, name, address, emailId, username, password, phoneNumber, userType);
                System.out.println("three");
                break;
            case RECEPTIONIST:
                user = new Receptionist(++currentIdNumber, name, address, emailId, username, password, phoneNumber, userType);
                System.out.println("three");
                break;
            case HOSPITAL:
                user = new Hospital(++currentIdNumber, branchCode, name, address, emailId, username, password, phoneNumber, userType);
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }

        if (user != null) {
            userList.add(user);
        }
    }

    public void deleteUser(int userId) {
        User user = searchUser(userId);
        if (user != null) {
            userList.remove(user);
        }
    }

    public User searchUser(int userId) {
        for (User user : userList) {
            if (user.getUserId() == userId) {
                return user;
            }
        }

        return null;
    }

    public User searchUser(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public User login(String username, String password) {
        User user = searchUser(username, password);
        if (user != null) {
            return user;
        }

        return null;
    }

    public void listUsers() {
    }

    private int EmployeeIdGenerator() {
        return 1;
    }
}
