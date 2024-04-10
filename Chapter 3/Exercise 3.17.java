public String padString(String string, int length) {
    if (string.length() < length) {
        String paddedString = "";
        for (int i = 0; i < (length - string.length()); i++) {
            paddedString += " ";
        }
        string = paddedString + string;
    }
    
    return string;
}