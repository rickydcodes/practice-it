public static void printGPA() {
    Scanner console = new Scanner(System.in);
    
    System.out.print("Enter a student record: ");
    String data = console.nextLine();
    
    String[] dataList = data.split(" ");
    String name = dataList[0];
    int numOfGrades = Integer.parseInt(dataList[1]);
    int gradeSum = 0;
    
    for (int i = 2; i < dataList.length; i++) {
        gradeSum += Integer.parseInt(dataList[i]);
    }
    
    double finalGrade = (double) gradeSum / numOfGrades;
    
    System.out.println(name + "'s grade is " + finalGrade);
}