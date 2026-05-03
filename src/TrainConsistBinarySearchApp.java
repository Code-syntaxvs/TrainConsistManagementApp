import java.util.Arrays;

public class TrainConsistBinarySearchApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Handle empty array safely
        if (bogieIds.length == 0) {
            return false;
        }

        // Ensure array is sorted before binary search
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        // Test Case 1: Bogie Found
        String[] bogies1 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println("Searching BG309: " + binarySearch(bogies1, "BG309"));

        // Test Case 2: Bogie Not Found
        System.out.println("Searching BG999: " + binarySearch(bogies1, "BG999"));

        // Test Case 3: First Element Match
        System.out.println("Searching BG101: " + binarySearch(bogies1, "BG101"));

        // Test Case 4: Last Element Match
        System.out.println("Searching BG550: " + binarySearch(bogies1, "BG550"));

        // Test Case 5: Single Element Array
        String[] single = {"BG101"};
        System.out.println("Searching BG101 in single array: " + binarySearch(single, "BG101"));

        // Test Case 6: Empty Array
        String[] empty = {};
        System.out.println("Searching BG101 in empty array: " + binarySearch(empty, "BG101"));

        // Test Case 7: Unsorted Input
        String[] unsorted = {"BG309","BG101","BG550","BG205","BG412"};
        System.out.println("Searching BG205 in unsorted array: " + binarySearch(unsorted, "BG205"));

        System.out.println("\nBinary Search completed successfully.");
    }
}