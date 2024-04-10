public static void printTriangleType(int a, int b, int c) {
    if (a == b && b == c) {
        System.out.println("equilateral");
    } else if ((a == b && b != c) || (b == c && c != a) || (a == c && b != c)) {
        System.out.println("isosceles");
    } else {
        System.out.println("scalene");
    }
}