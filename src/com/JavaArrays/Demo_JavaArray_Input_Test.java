package com.JavaArrays;
// Java Arrays Challenge: Sort List in Descending Order (Using Inheritance (OOP))
// A program using arrays that sorts a list of integers in descending order.
// Program is set up so that the numbers to sort are read in from the keyboard.
// Following methods are implemented: getIntegers, printArray, and sortIntegers
// - getIntegers returns an array of entered integers from keyboard
// - printArray prints out the contents of the array
// - sortIntegers should sort the array and return a new array containing the sorted numbers
// NB: I had to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

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
