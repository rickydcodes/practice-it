public int priceIsRight(int[] birds, int price) {
    int closestNum = -1;
    for (int i = 0; i < birds.length; i++) {
        if (birds[i] <= price && price - birds[i] < price - closestNum) {
            closestNum = birds[i];
        }
    }
    
    return closestNum;
}