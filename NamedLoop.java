public class NamedLoop {
    public static void main(String[] args) {
        myLoop:
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration:-" + i);

            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner loop iteration:-" + j);

                if (i == 2 && j == 2) {
                    System.out.println("Breaking the outer loop from the inner loop");
                    break myLoop;
                }
            }
        }
    }
}
