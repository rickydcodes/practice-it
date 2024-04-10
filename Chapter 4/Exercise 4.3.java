public static String season(int month, int day) {
    if ((month == 12 && day >= 16) || (month == 3 && day <= 15) || month < 3) {
        return "Winter";
    } else if (((month == 3 && day >= 16) || (month > 3)) && ((month == 6 && day <= 15) || (month < 6))) {
        return "Spring";
    } else if (((month == 6 && day >= 16) || (month > 6)) && ((month == 9 && day <= 15) || (month < 9))) {
        return "Summer";
    } else {
        return "Fall";
    }
}