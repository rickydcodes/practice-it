String topString = "";
String bottomString = "";

for (int j = 0; j < 6; j++) {
    for (int i = 0; i < 9; i++) {
        topString += " ";
    }
    topString += "|";
    
    for (int i = 1; i <= 10; i++) {
        if (i == 10) {
            bottomString += 0;
        } else {
            bottomString += i;
        }
    }
}

System.out.println(topString);
System.out.println(bottomString);