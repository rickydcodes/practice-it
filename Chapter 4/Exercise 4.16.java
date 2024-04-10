public static void printPalindrome(Scanner console) {
    System.out.print("Type one or more words: ");
    String word = console.nextLine();
    String lowerCaseWord = word.toLowerCase();

    for (int i = 0; i < word.length(); i++) {
        if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(word.length() - i - 1)) {
            System.out.println(word + " is not a palindrome.");
            return;
        }
    }
    
    System.out.println(word + " is a palindrome!");
}