public class TheNameGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String fullName = console.nextLine();
        
        String firstName = fullName.split(" ")[0];
        String lastName = fullName.split(" ")[1];
        
        write4Lyrics(firstName);
        System.out.println();
        write4Lyrics(lastName);
    }
    
    public static void write4Lyrics(String name) {
        String choppedName = name.substring(1);
        System.out.println(name + " " + name + ", bo-B" + choppedName);
        System.out.println("Banana-fana fo-F" + choppedName);  
        System.out.println("Fee-fi-mo-M" + choppedName);
        System.out.println(name.toUpperCase() + "!");
    }
}