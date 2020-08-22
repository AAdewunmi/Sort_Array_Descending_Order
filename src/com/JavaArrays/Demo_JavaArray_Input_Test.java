package com.JavaArrays;

public class Demo_JavaArray_Input_Test extends Demo_JavaArrays_Input{
    public static void main(String[] args) {
        //Insert number of desired elements into getIntegers() method
        int[] myIntegers = getIntegers(5);
        // Print Array using printArray method
        int[] sorted = sortIntegers(myIntegers);
        // Sort Array in Descending order
        printArray(sorted);
    }
}
