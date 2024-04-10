public static void printAcronym(String str) {
    String[] words = str.split(" ");
    String acronym = "";
    
    for (int i = 0; i < words.length; i++) {
        acronym += words[i].charAt(0);
    }
    
    System.out.println(acronym);
}