public static void longestName(Scanner console, int n) {
    String[] names = new String[n];
    String longestName = "";
    
    for (int i = 0; i < n; i++) {
        System.out.print("name #" + (i + 1) + "? ");
        String currentName = console.nextLine();
        if (currentName.length() > longestName.length()) {
            longestName = currentName;
        }
        
        names[i] = currentName;
    }

    String firstChar = longestName.substring(0, 1);
    String otherChars = longestName.substring(1, longestName.length());
    String finalName = firstChar.toUpperCase() + otherChars.toLowerCase();
    
    System.out.println(finalName + "'s name is longest");
    
    for (int i = 0; i < names.length; i++) {
        if (names[i] != longestName && names[i].length() == longestName.length()) {
            System.out.println("(There was a tie!)");
            break;
        }
    }
}