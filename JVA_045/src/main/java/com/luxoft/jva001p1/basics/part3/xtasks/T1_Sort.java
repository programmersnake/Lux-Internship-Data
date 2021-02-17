package com.luxoft.jva001p1.basics.part3.xtasks;

import java.util.Arrays;
import java.util.Random;

public class T1_Sort
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = getArrOfRandomInts(10_000);

        int[] copyToSort = Arrays.copyOf(numbers, numbers.length);

        long startTime = System.currentTimeMillis();

        sortAsc(copyToSort);

        long endTime = System.currentTimeMillis();

        System.out.println("-->" + (endTime - startTime));

        int[] copyToCheck = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(copyToCheck);
        System.out.println("Is numbers sorted: "
                + String.valueOf(Arrays.equals(copyToCheck, copyToSort)).toUpperCase());
    }

    private static int[] getArrOfRandomInts(int count)
    {
        int[] numbers = new int[count];

        Random r = new Random();
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = r.nextInt(1000);
        }
        return numbers;
    }

    /**
     *
     * Method should sort data array ascending order.
     *
     */
    public static void sortAsc(int[] data) {
        System.out.println(Arrays.toString(data));

        //bubbleSort( data );
        binarySort( data, 0, data.length-1 );

        System.out.println(Arrays.toString(data));
    }

    public static void bubbleSort(int[] inputArray) {
        int[] tempArray = inputArray;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < tempArray.length - 1; i++) {
                if (tempArray[i] > tempArray[i+1]) {
                    int tempValue = tempArray[i];
                    tempArray[i] = tempArray[i+1];
                    tempArray[i+1] = tempValue;
                    isSorted = false;
                }
            }
        }
    }

    private static void binarySort(int[] inputArray, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(inputArray, begin, end);
        binarySort(inputArray, begin, pivot-1);
        binarySort(inputArray, pivot+1, end);
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    /**
     *
     * Method should exchange values with idx1 and idx2 in data array.
     *
     */
    public static void swap(int[] data, int idx1, int idx2) {
        data[idx1] = data[idx1] - data[idx2];
        data[idx2] = data[idx2] + data[idx1];
        data[idx1] = data[idx2] - data[idx1];
    }
}
