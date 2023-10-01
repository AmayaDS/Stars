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

//methods
class RightAngledTrianglePattern {
    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class InvertedRightAngledTrianglePattern {
    public static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class PyramidPattern {
    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
