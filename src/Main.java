public class Main {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Right-Angled Triangle Pattern:");
        RightAngledTrianglePattern.printPattern(rows);

        System.out.println("\nInverted Right-Angled Triangle Pattern:");
        InvertedRightAngledTrianglePattern.printPattern(rows);

        System.out.println("\nPyramid Pattern:");
        PyramidPattern.printPattern(rows);
    }
}