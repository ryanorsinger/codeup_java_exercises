import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalStateException;

/**
 * main() method is our "procedural code"
 * "procedural code" is code that runs as a waterfall or "just runs"
 *
 */

public class UserDemoApp {
    public static void main(String[] args) {
        // If human submits the "register new user" form on our web page
        // or if human runs the command line application
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        boolean userSavedSuccessfully = false;
        boolean isAdmin = false;
        String username = "";
        String password = "";
        String email = "";
        Permissions permission;

        // create a new blank user
        User user = new User();

        username = getUsernameFromUser(sc); // prompt user for their username
        user.setUsername(username);         // assign the *valid* input to that user object

        email = getEmailFromUser(sc);
        user.setEmail(email);    // setting the email

        isAdmin = getAdminStatus(sc);
        user.setAdmin(isAdmin);

        password = getPassword(sc);
        user.setPassword(password);

        userSavedSuccessfully = tryToSaveUser(sc, user);

        if(userSavedSuccessfully) {
            System.out.println("Welcome to Etsy, " + user.getUsername() + "!");
            System.out.println("We emailed you a coupon to " + user.getEmail());
            if(user.isAdmin()) {
                user.setPermissionLevel(makeAdmin());

            }
            System.out.println("User permissions are: " + user.getPermissionLevel());
        } else {
            System.out.println("there was a problem creating your account");
        }
    }

    protected static Permissions makeAdmin() {
        Permissions permission = Permissions.ADMIN;
        return permission;
    }

    protected static boolean tryToSaveUser(Scanner sc, User user) {
        boolean userSavedSuccessfully = false;
        try {
            userSavedSuccessfully = user.saveUser();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        return userSavedSuccessfully;
    }

    protected static String getPassword(Scanner sc) {
        String password = "";
        // Get the password from the user and set it on the user object
        System.out.print("Password: ");
        try {
            password = sc.next();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        return password;
    }

    protected static String getUsernameFromUser(Scanner sc) {
        String username = "";

        // get the username from the scanner and call .setUserName() method on the new user
        System.out.print("Please input your desired username: ");
        try {
            username = sc.next();
        } catch (IllegalStateException e) {
            System.out.println("There was an error. Please see info on next line");
            System.out.println(e.getMessage());
        }

        return username;
    }

    protected static String getEmailFromUser(Scanner sc) {
        String email = "";
        System.out.print("Please input your email address: ");
        try {
            email = sc.next();
        } catch (IllegalStateException e) {
            System.out.println("There was an error. Please see info on next line");
            System.out.println(e.getMessage());
        }
        return email;
    }

    protected static boolean getAdminStatus(Scanner sc) {
        boolean isAdmin = false;

        System.out.println("Input true/false if user should be an administrator");
        try {
            isAdmin = sc.nextBoolean();
        } catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return isAdmin;
    }

}
