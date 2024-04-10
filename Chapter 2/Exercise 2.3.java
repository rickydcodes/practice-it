int[] fibNumbers = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
System.out.print("1 1 ");

for (int i = 2; i < 12; i++) {
    fibNumbers[i] = (fibNumbers[i - 2] + fibNumbers[i - 1]);
    System.out.print(fibNumbers[i] + " ");
}