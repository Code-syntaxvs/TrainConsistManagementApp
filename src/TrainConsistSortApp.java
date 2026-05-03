import java.util.Arrays;

public class TrainConsistSortApp {

    // Method to sort bogie names using Arrays.sort()
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);  // Built-in sorting
    }

    public static void main(String[] args) {

        // Test Case 1: Basic Alphabetical Sorting
        String[] bogies1 = {"Sleeper","AC Chair","First Class","General","Luxury"};
        System.out.println("Before Sorting: " + Arrays.toString(bogies1));

        sortBogieNames(bogies1);

        System.out.println("After Sorting:  " + Arrays.toString(bogies1));
        System.out.println();

        // Test Case 2: Unsorted Input
        String[] bogies2 = {"Luxury","General","Sleeper","AC Chair"};
        sortBogieNames(bogies2);
        System.out.println("Unsorted Input Sorted: " + Arrays.toString(bogies2));

        // Test Case 3: Already Sorted
        String[] bogies3 = {"AC Chair","First Class","General"};
        sortBogieNames(bogies3);
        System.out.println("Already Sorted: " + Arrays.toString(bogies3));

        // Test Case 4: Duplicate Bogie Names
        String[] bogies4 = {"Sleeper","AC Chair","Sleeper","General"};
        sortBogieNames(bogies4);
        System.out.println("With Duplicates: " + Arrays.toString(bogies4));

        // Test Case 5: Single Element
        String[] bogies5 = {"Sleeper"};
        sortBogieNames(bogies5);
        System.out.println("Single Element: " + Arrays.toString(bogies5));

        System.out.println("\nSorting completed using Arrays.sort().");
    }
}