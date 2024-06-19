package se.lexicon;

import java.util.Arrays;

/**
 * The NameRepository class provides methods to manage a list of names.
 * It offers functionalities such as adding, removing, finding, and updating names.
 */
public class NameRepository {

    private static String[] names = new String[0];


    /**
     * Retrieves the current size of the names array.
     *
     * @return The number of elements in the names array.
     */
    public static int getSize() {
        int size = names.length;
        return size;
    }


    /**
     * Sets the names array to the provided array of names & it should replace all existing names.
     *
     * @param newNames The array of names to set.
     */
    public static void setNames(String[] newNames) {
        names = Arrays.copyOf(newNames, newNames.length);
    }


    /**
     * Clears the names array by creating a new empty array.
     */
    public static void clear() {

        names = new String[0];

    }

    /**
     * Returns all names in a new array (Retrieves a copy of the names array).
     *
     * @return A new array containing all elements from the names array.
     */
    public static String[] findAll() {

        //Create a new Array.
        String[] copiedArrays = new String[names.length];

        // Copy elements from names array to copiedArrays.
        for (int i = 0; i < names.length; i++) {
            copiedArrays[i] = names[i];
        } // for

        return copiedArrays;
    }

    // Part 02 --------------------------------------------------------

    /**
     * Finds a name that matches the given fullName case-insensitively.
     *
     * @param fullName The full name to search for.
     * @return The matching name if found; otherwise, null.
     */
    public static String find(String fullName) {

        for (int i = 0; i < names.length; i++) {

            if (fullName.equalsIgnoreCase(names[i])) {
                return names[i];
            }
        }
        return null;
    } // find

    /**
     * Adds a new fullName to the names array if it doesn't already exist.
     *
     * @param fullName The full name to add.
     * @return True if the fullName is added successfully; false if it already exists.
     */
    public static boolean add(String fullName) {

        // Check if the name already exists in the array
        for (int i = 0; i < names.length; i++) {
            if (fullName.equalsIgnoreCase(names[i])) {
                return false; // name already exist
            }//if
        } //for
        // if the name is not exist. add it to the new array with additional slot.
        String[] newArrays = Arrays.copyOf(names, names.length + 1);
        // add a new name to the end of the newArrays.
        newArrays[newArrays.length - 1] = fullName;
        // Assign the new array
        names = newArrays;
        return true;
    } //add

    // Part 03 --------------------------------------------------------

    /**
     * Find all names that match the given firstName.
     *
     * @param firstName The first name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByFirstName(String firstName) {

        String[] tempArray = new String[0];

        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" ");

            if (firstName.equalsIgnoreCase(parts[0])) {
                // make a copy of tempArray and expand it with one more element.
                // then add the element value to the last index of the array - 1
                String[] newArray = Arrays.copyOf(tempArray, tempArray.length + 1);
                newArray[tempArray.length] = names[i];
                tempArray = newArray;
            } // if
        } // for-loop
        return tempArray;
    } // findByFirstname


    /**
     * Find all names that match the given lastName.
     *
     * @param lastName The last name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByLastName(String lastName) {

        // create a temporary Array to store the names.
        String[] tempArray = new String[0];

        // Iterate the names array.
        for (int i = 0; i < names.length; i++) {
            //Split the names in two name and lastName.
            String[] parts = names[i].split(" ");

            if (lastName.equalsIgnoreCase(parts[1])) {
                //Make a copy of the tempArray with one elements.
                // add the value to to that index.
                String[] newArray = Arrays.copyOf(tempArray, tempArray.length + 1);
                newArray[tempArray.length] = names[i];
                tempArray = newArray;
            }
        } //for-loop
        return tempArray;
    }

    /**
     * Updates a name in the names array from the original name to the updated name.
     *
     * @param original    The original name to update.
     * @param updatedName The updated name to set.
     * @return True if the name is updated successfully; false if the updated name already exists
     * or the original name is not found.
     */
    public static boolean update(String original, String updatedName) {





    }


    /**
     * Removes a name from the names array, case-insensitively.
     *
     * @param fullName The full name to remove.
     * @return True if the name is removed successfully; false if the name is not found in the array.
     */
    public static boolean remove(String fullName) {
        //todo: PART 4: implement remove method
        return false;
    }


}