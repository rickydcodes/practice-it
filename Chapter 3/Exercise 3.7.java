public int largestAbsVal(int a, int b, int c) {
    return Math.max(Math.max(Math.abs(a), Math.abs(b)), Math.max(Math.abs(b), Math.abs(c)));
}