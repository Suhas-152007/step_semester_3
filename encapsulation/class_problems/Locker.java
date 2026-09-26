class Locker {

    private String code;
    private final int lockerNumber;

    Locker(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    void changeCode(String oldCode, String newCode) {

        if (code.equals(oldCode)) {
            code = newCode;
            System.out.println("Code changed successfully");
        } else {
            System.out.println("Wrong current code. Code not changed");
        }
    }

    public static void main(String[] args) {

        Locker locker = new Locker(101, "1234");

        locker.changeCode("1234", "5678");

        locker.changeCode("0000", "9999");
    }
}