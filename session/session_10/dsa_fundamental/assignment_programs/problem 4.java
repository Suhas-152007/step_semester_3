
class Main {
    static String[] rotateRoster(String[] names, int k) {
        int n = names.length;
        String[] rotated = new String[n];

        k = k % n;

        for (int i = 0; i < n; i++) {
            int newPosition = (i + k) % n;
            rotated[newPosition] = names[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};

        String[] result = rotateRoster(names, 7);

        System.out.print("Rotated roster: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
```