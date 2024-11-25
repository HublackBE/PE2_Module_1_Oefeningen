public class m1_sterrenpiramide {
    public static void sterrenpiramide() {
        short hoogte = 5;
        for (int i = 0; i < hoogte; i++) {
            System.out.println("*".repeat(i+1));
        }
    }
    public static void main(String[] args) {
        sterrenpiramide();
    }
}
