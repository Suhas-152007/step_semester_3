class PasswordChecker {

    private final String password;

    PasswordChecker(String password) {
        this.password = password;
    }

    String getStrength() {

        int length = password.length();

        if (length < 6) {
            return "Weak";
        } else if (length <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {

        PasswordChecker p1 = new PasswordChecker("abcd");
        PasswordChecker p2 = new PasswordChecker("abcdefgh");
        PasswordChecker p3 = new PasswordChecker("abcdefghijkl");

        System.out.println("Password 1: " + p1.getStrength());
        System.out.println("Password 2: " + p2.getStrength());
        System.out.println("Password 3: " + p3.getStrength());
    }
}