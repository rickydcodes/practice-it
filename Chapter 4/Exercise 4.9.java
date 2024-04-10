public static void evenSum() {
    Scanner console = new Scanner(System.in);
    int sum = 0;
    int max = 0;
    
    System.out.print("how many integers? ");
    int num = console.nextInt();
    
    for (int i = 0; i < num; i++) {
        System.out.print("next integer? ");
        int nextInt = console.nextInt();
        
        if (nextInt % 2 == 0) {
            sum += nextInt;
            if (nextInt > max) {
                max = nextInt;
            }
        }
    }
    
    System.out.println("even sum = " + sum);
    System.out.println("even max = " + max);
}