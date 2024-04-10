public static void smallestLargest() {
    Scanner console = new Scanner(System.in);
    int smallest = 0;
    int largest = 0;

    System.out.print("How many numbers do you want to enter? ");
    int numbers = console.nextInt();
    
    for (int i = 0; i < numbers; i++) {
        System.out.print("Number " + (i + 1) + ": ");
        int number = console.nextInt();
        
        if (i == 0) {
            smallest = number;
            largest = number;
        } else if (number > largest) {
            largest = number;
        } else if (number < smallest) {
            smallest = number;
        }
    }
    
    System.out.println("Smallest = " + smallest);
    System.out.println("Largest = " + largest);
    
}