import java.util.Scanner;
public class m1_sterrenpiramide {
    public static void sterrenpiramide() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Geef een hoogte in: ");
        short hoogte = reader.nextShort();
        for (int i = 0; i < hoogte; i++) {
            System.out.println("*".repeat(i+1));
        }
    }
    public static void main(String[] args) {
        sterrenpiramide();
    }
}
