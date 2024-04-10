public double percentEven(int[] a) {    
    double evenNumbers = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 0) {
            evenNumbers++;
        }
    }
    
    if (evenNumbers == 0 || a.length == 0) {
        return 0.0;
    } else {
        return (evenNumbers / a.length) * 100;
    }
}