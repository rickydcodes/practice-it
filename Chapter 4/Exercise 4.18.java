public static int wordCount(String str) {
    int numOfWords = 0;
    String[] words = str.split(" ");
    
    for (int i = 0; i < words.length; i++) {
        if (words[i].length() >= 1 && words[i] != " ") {
            numOfWords++;
        }
    }
    
    return numOfWords;
}