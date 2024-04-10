public void processName(Scanner console) {
    System.out.print("Please enter your full name: ");
    String fullName = console.nextLine();
    
    String firstName = fullName.split(" ")[0];
    String lastName = fullName.split(" ")[1];
    
    System.out.println("Your name in reverse order is " + lastName + ", " + firstName);
}