public class e1_loops {
    public static void forLoop() {
        for (int i = 36; i <= 60; i++) {
            System.out.print(i + " ");
        }
    }
    public static void whileLoop() {
        int i = 36;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 60);
    }
    public static void main(String[] args) {
        System.out.print("For: ");
        forLoop();
        System.out.print("\nWhile: ");
        whileLoop();
    }
}
