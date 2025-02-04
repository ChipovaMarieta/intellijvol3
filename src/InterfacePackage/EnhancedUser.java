package InterfacePackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EnhancedUser implements IUser{

    private String userName;
    String dateRegistration;
    private boolean isLoggedIn;
    private boolean isAdmin;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public EnhancedUser(String userName) {
        this.userName = userName;
        this.isAdmin = false;
        this.dateRegistration = String.valueOf(this.dtf.format(this.now));
    }

    public EnhancedUser() {
    }

    public void login() {
        this.isLoggedIn = true;
        System.out.println("User logged in");
    }

    public void logout() {
        this.isLoggedIn = false;
        System.out.println("User logged out.");
    }

    public String nameUser() {
        return this.userName;
    }

    public String getDateRegistration() {
        return this.dateRegistration;
    }

    public void setDateRegistration(String dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public DateTimeFormatter getDtf() {
        return this.dtf;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public void setAdmin(boolean admin) {
        this.isAdmin = admin;
    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
    }

    public LocalDateTime getNow() {
        return this.now;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String dateRegistration() {
        return this.dateRegistration;
    }

    @Override
    public String printUserInfo() {
            return "AbstractUser{" +
                    "dateRegistration=" + dateRegistration +
                    ", userName='" + userName + '\'' +

                    ", isAdmin=" + isAdmin +
                    ", isLoggedIn=" + isLoggedIn +
                    '}';
        }

    }




