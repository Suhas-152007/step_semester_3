
public class PasswordChecker {
    private String password;

    PasswordChecker(String password) {
        this.password = password;
    }

    void checkPassword() {
        if (password.length() >= 8) {
            System.out.println("Password is strong enough.");
        } else {
            System.out.println("Password must contain at least 8 characters.");
        }
    }

    public static void main(String[] args) {
        PasswordChecker user = new PasswordChecker("java12345");
        user.checkPassword();
    }
}