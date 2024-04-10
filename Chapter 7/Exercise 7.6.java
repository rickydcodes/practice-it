 public double stdev(int[] array) {
    double total = 0;
    for (int i = 0; i < array.length; i++) {
        total += array[i];
    }
    
    double mean = total / array.length;
    double sum = 0;
    
    for (int i = 0; i < array.length; i++) {
        sum += Math.pow(mean - array[i], 2);
    }
    
    return Math.sqrt(sum / (array.length - 1));
}