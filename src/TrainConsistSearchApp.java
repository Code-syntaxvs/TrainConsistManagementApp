public class TrainConsistSearchApp {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found → stop early
            }
        }

        return false; // Not found after full traversal
    }

    public static void main(String[] args) {

   
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        // Test Case 1: Bogie Found
        String search1 = "BG309";
        System.out.println("Searching " + search1 + ": " + linearSearch(bogies, search1));

        // Test Case 2: Bogie Not Found
        String search2 = "BG999";
        System.out.println("Searching " + search2 + ": " + linearSearch(bogies, search2));

       
        String search3 = "BG101";
        System.out.println("Searching " + search3 + ": " + linearSearch(bogies, search3));

        // Test Case 4: Last Element Match
        String search4 = "BG550";
        System.out.println("Searching " + search4 + ": " + linearSearch(bogies, search4));

        // Test Case 5: Single Element Array
        String[] single = {"BG101"};
        String search5 = "BG101";
        System.out.println("Searching " + search5 + " in single array: " + linearSearch(single, search5));

        System.out.println("\nSearch operation completed successfully.");
    }
}