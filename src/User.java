/**
 * User class is the blueprint for users of our application
 * Classes are like function definitions that return an object of that class's type
 * Objects of that class's type are returned when we call `new User()`
 * Generic classes mean we can re-use the code regardless of the implementation
 * Where the implementation is mobile, desktop, web app, console app, embedded device
 * Class based code doesn't run until we call it (like calling a function)
 * instantiating or "calling" a class is done by `new User()`
 */

public class User {
    String email;
    String username;
    String password;
    Permissions permissionLevel;
    boolean isAdmin;
    boolean userSavedToDatabase;

    // pretend that saveUser talks to the DB
    // attempts to save
    // if db connection is good and save successfull, return true
    public boolean saveUser() {
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userNameSentAsArgument) {
        this.username = userNameSentAsArgument;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Permissions getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Permissions permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
