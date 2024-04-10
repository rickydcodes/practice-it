public static double getGrade(int score) {    
    if (score < 0 || score > 100) {
        throw new IllegalArgumentException("Invalid score");
    }
    
    if (score < 60) {
        return 0.0;
    } else if (score <= 62) {
        return 0.7;
    } else if (score == 63) {
        return 0.8;
    } else if (score == 64) {
        return 0.9;
    } else if (score == 65) {
        return 1.0;
    } else if (score <= 92) {
        return 3.7;
    } else if (score == 93) {
        return 3.8;
    } else if (score == 94) {
        return 3.9;
    } else {
        return 4.0;
    }
}