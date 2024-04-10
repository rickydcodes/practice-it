public static String stutter(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
        newStr += str.charAt(i);
        newStr += str.charAt(i);
    }
    
    return newStr;
}