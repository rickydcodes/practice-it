public class NumbersOutput {
    public static final int range = 10;
    public static final int reps = 6;
    
    public static void main(String[] args) {
        String topString = "";
        String bottomString = "";
        
        for (int j = 0; j < reps; j++) {
            for (int i = 1; i < range; i++) {
                if (i < range) {
                    bottomString += i;
                }
            }
            bottomString += "0";
            
            // for the record, i had a solution with 2 total for loops but they wouldnt let me use it
            for (int i = 1; i < range; i++) {
                if (i < range) {
                    topString += " ";
                }
            }
            topString += "|";
        }
        
        System.out.println(topString);
        System.out.println(bottomString);
    }
}