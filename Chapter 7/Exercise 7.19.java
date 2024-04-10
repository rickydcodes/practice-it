public static void wordLengths(Scanner input) {
	int[] charNumbers = new int[81];
    while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            charNumbers[words[i].length()]++;
        }
    }
    
    for (int i = 1; i < charNumbers.length; i++) {
        if (charNumbers[i] > 0) {
            String endString = i + ": " + charNumbers[i];
            
            for (int j = 0; j < (int) (10 - endString.length()) / 4; j++) {
                endString += "\t";
            }
            
            for (int j = 0; j < charNumbers[i]; j++) {
                endString += "*";
            }
            System.out.println(endString);
        }
    }
}