public class qnsix {
    public static void main(String[] args) {
        int n = 5; // size of the pattern

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(n - j + " ");
                } else {
                    System.out.print(n - i + " ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
