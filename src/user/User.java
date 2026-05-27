package user;

public class User {

    // Variables
    private int userId;
    private String userName;
    private String email;

    // Constructor
    public User(int userId,
                String userName,
                String email) {

        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    // Display Method
    public void displayUser() {

        System.out.println("User ID    : " + userId);
        System.out.println("User Name  : " + userName);
        System.out.println("Email      : " + email);
    }
}