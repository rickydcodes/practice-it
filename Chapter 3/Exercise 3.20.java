public void inputBirthday(Scanner console) {
    System.out.print("On what day of the month were you born? ");
    String day = console.nextLine();
    
    System.out.print("What is the name of the month in which you were born? ");
    String month = console.nextLine();
    
    System.out.print("During what year were you born? ");
    String year = console.nextLine();
    
    System.out.println("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");
}