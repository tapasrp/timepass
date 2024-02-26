package org.some;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySearchMark2 {
    private static final Logger LOGGER = Logger.getLogger(BinarySearchMark2.class.getName());


    public static void main(String[] args) {

        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

        LOGGER.info(String.valueOf(iterativeBinarySearch(intArray, -15)));
        LOGGER.info(String.valueOf(iterativeBinarySearch(intArray, 35)));
        LOGGER.info(String.valueOf(iterativeBinarySearch(intArray, 8888)));
        LOGGER.info(String.valueOf(iterativeBinarySearch(intArray, 1)));

        LOGGER.info(String.valueOf(recursiveBinarySearch(intArray, -15)));
        LOGGER.info(String.valueOf(recursiveBinarySearch(intArray, 35)));
        LOGGER.info(String.valueOf(recursiveBinarySearch(intArray, 8888)));
        LOGGER.info(String.valueOf(recursiveBinarySearch(intArray, 1)));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            LOGGER.info("midpoint = " + midpoint);
            if (input[midpoint] == value) {
                return midpoint;
            }
            else if (input[midpoint] < value) {
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        LOGGER.info("midpoint = " + midpoint);

        if (input[midpoint] == value) {
            return midpoint;
        }
        else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }

   

}
