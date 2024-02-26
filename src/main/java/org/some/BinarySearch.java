package org.some;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySearch {
    private static final Logger LOGGER = Logger.getLogger(BinarySearch.class.getName());
    private static int count = 0;

    public static void main(String[] args) {

        int[] numArr = new int[]{13, 21, 34, 45, 57, 68, 79, 80, 94, 102, 111, 122, 133, 145, 157};

        int numberToSearch = 102;
        boolean found = findNumber(numberToSearch, numArr);

        LOGGER.log(Level.INFO, "searched {0} in list : {1} , Found : {2}",
                new Object[]{numberToSearch, Arrays.toString(numArr), found});


    }

    private static boolean findNumber(int numberToSearch, int[] numArr) {

        System.out.println(++count);


        int guessPosition = numArr.length / 2;
        if (numberToSearch == numArr[guessPosition]) {
            LOGGER.log(Level.INFO, "found it");
            return true;
        } else if (numberToSearch < numArr[guessPosition]) {
            findNumber(numberToSearch, getSmallerArray(numArr, 0, guessPosition));
        } else {
            findNumber(numberToSearch, getSmallerArray(numArr, guessPosition, numArr.length - 1));
        }

        return false;
    }

    private static int[] getSmallerArray(int[] array, int startIndex, int endIndex) {
        int smallerArrayLength = (endIndex - startIndex) + 1;
        int[] smallerArray = new int[smallerArrayLength];
        int smallerArrayPositionToInsert = 0;
        for (int i = startIndex; i <= endIndex; i++) {

            smallerArray[smallerArrayPositionToInsert] = array[i];
            smallerArrayPositionToInsert++;
        }
        LOGGER.log(Level.INFO, "smaller array {0} ", smallerArray);
        return smallerArray;

    }

}
