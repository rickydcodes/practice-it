public static int[] vowelCount(String str) {
    int[] count = new int[5];
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int v = 0; v < vowels.length; v++) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == vowels[v]) {
                count[v]++;
            }
        }
    }
    return count;
}