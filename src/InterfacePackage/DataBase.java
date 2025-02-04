package InterfacePackage;

public class DataBase {

    private IUser[] dataBase;

    public DataBase(int userCount) {
        this.dataBase = new IUser[userCount];
    }

    public IUser[] getDataBase() {
        return this.dataBase;
    }
}
