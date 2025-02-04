package InterfacePackage;

public class Demo {

    public static void main(String[] args) {

        AdminUserImpl admin = new AdminUserImpl("admin");


        admin.createUser("user1", false);
        admin.createUser("user2", false);
        admin.createUser("user3", false);
        admin.createUser("user4", false);
        admin.createUser("user5", false);
        admin.createUser("user6", false);

        admin.createUser("admin1", true);
        admin.createUser("admin2", true);
        admin.createUser("admin3", true);
        admin.createUser("admin4", true);


        admin.createUser("extraUser", false);
        admin.createUser("extraAdmin", true);


        System.out.println("All users in database of the admin:");
        admin.printUserData();


        System.out.println("\n Deleting 'user1':");
        admin.deleteUser("user1");

        System.out.println("\nDeleting user 'nonExistentUser':");
        admin.deleteUser("nonExistentUser");


        admin.deleteUser("user2");
        admin.deleteUser("user3");
        admin.deleteUser("user4");
        admin.deleteUser("user5");
        admin.deleteUser("user6");
        admin.deleteUser("admin1");
        admin.deleteUser("admin2");
        admin.deleteUser("admin3");
        admin.deleteUser("admin4");


        System.out.println("\nDeliting the user of empty database:");
        admin.deleteUser("admin4");

        
        System.out.println("\nAll users after deleting:");
        admin.printUserData();
    }
}
