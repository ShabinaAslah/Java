import java.util.Scanner;

class InvalidlogicExeption extends Exception {
    public InvalidlogicExeption(String message) {
        super(message);
    }
}
class UserAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.println("Enter username:");
        username = sc.next();

        System.out.println("Enter passwd:");
        password = sc.next();

        try {
            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("login successful");
            } else {
                throw new InvalidlogicExeption("Invalid username or password");
            }
        } catch (InvalidlogicExeption e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
