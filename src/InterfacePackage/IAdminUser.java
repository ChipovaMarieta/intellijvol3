package InterfacePackage;

public interface IAdminUser extends IUser{

    void deleteUser(String var1);

    IUser createUser(String var1, boolean var2);

    void printUserData();
}
