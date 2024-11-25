import java.util.Scanner;

public class h1_ggd {
    public static int gemeneDeler(int x, int y) {
        int grootsteGemeneDeler = -1;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && y % i == 0) {
                grootsteGemeneDeler = i;
            }
        }
        return grootsteGemeneDeler;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Nummer 1: ");
        int x = reader.nextInt();
        System.out.print("Nummer 2: ");
        int y = reader.nextInt();
        System.out.println("\nDe grootste gemene deler is: " + gemeneDeler(x, y));
    }
}