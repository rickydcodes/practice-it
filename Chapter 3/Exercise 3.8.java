public void quadratic(int a, int b, int c) {
    double sqrt = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
    double firstRoot = (-b + sqrt) / (2 * a);
    double secondRoot = (-b - sqrt) / (2 * a);

    System.out.println("First root = " + firstRoot);
    System.out.println("Second root = " + secondRoot);
}