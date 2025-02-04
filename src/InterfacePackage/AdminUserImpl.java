package InterfacePackage;

public class AdminUserImpl extends EnhancedUser implements IAdminUser {

    private DataBase adminDatabase = new DataBase(10);
    private IUser[] allUsers;
    private int countUsers;

    public AdminUserImpl(String userName) {
        this.allUsers = this.adminDatabase.getDataBase();
        this.setUserName(userName);
        this.setAdmin(true);
        this.dateRegistration = String.valueOf(this.dtf.format(this.now));
    }

    public void login() {
    }

    public void logout() {
    }

    public String nameUser() {
        return this.getUserName();
    }

    public String dateRegistration() {
        return this.dateRegistration();
    }

    @Override
    public String printUserInfo() {

        return null;
    }

    public void deleteUser(String userName) {
        for(int i = 0; i < this.allUsers.length; ++i) {
            if (this.allUsers[i] != null && this.allUsers[i].nameUser().equalsIgnoreCase(userName)) {
                this.allUsers[i] = null;
                return;
            }
        }

        System.out.println("The DB is empty or there is no such user");
    }

    public boolean isUserExist(String userName) {
        for(int i = 0; i < this.allUsers.length; ++i) {
            if (this.allUsers[i] != null && this.allUsers[i].nameUser().equals(userName)) {
                return true;
            }
        }

        return false;
    }

    public void addUsers(IUser userName) {
        if (this.countUsers < this.allUsers.length) {
            this.allUsers[this.countUsers++] = userName;
        } else {
            System.out.println("Database is full. Cannot add users anymore.");
        }

    }

    public void removeUser(String userName) {
        for(int i = 0; i < this.allUsers.length; ++i) {
            if (this.allUsers[i] != null && this.allUsers[i].nameUser().equals(userName)) {
                this.allUsers[i] = null;
                --this.countUsers;
                System.out.println(userName + "is deleted.");
                break;
            }
        }

    }

    public IUser createUser(String userName, boolean isAdmin) {
        if (this.isUserExist(userName)) {
            System.out.println("User already exist");
            return null;
        } else {
            Object newUser;
            if (isAdmin) {
                newUser = new AdminUserImpl(userName);
            } else {
                newUser = new UserImpl(userName);
            }

            this.addUsers((IUser)newUser);
            return (IUser)newUser;
        }
    }

    @Override
    public void printUserData() {

    }


    public void printAllUsers() {
        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] != null) {
                allUsers[i].printUserInfo();
                if (allUsers[i] instanceof IAdminUser) ;
                System.out.println("Role: Admin.");
            } else {
                System.out.println("Role: User.");
            }
        }


    }
}
